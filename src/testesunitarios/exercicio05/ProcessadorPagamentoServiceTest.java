
package poo.testesunitarios.exercicio05;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.never;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyDouble;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ProcessadorPagamentoServiceTest {

    @Mock
    private GatewayPagamento gateway;

    @Mock
    private PedidoRepository pedidoRepository;

    @InjectMocks
    private ProcessadorPagamentoService service;

    // Testar pagamento aprovado
    @Test
    public void testarPagamentoAprovado() {

        // Criando pedido
        Pedido pedido = new Pedido(
                1L,
                250.00,
                "PENDENTE"
        );

        // Executando o processamento
        service.processar(pedido);

        // Verificando alteração do status
        assertEquals("PAGO", pedido.getStatus());

        // Verificando se o gateway foi chamado
        verify(gateway, times(1)).cobrar(250.00);

        // Verificando se o pedido foi atualizado
        verify(pedidoRepository, times(1))
                .atualizar(pedido);
    }

    // Testar pagamento recusado
    @Test
    public void testarPagamentoRecusado() {

        // Criando pedido
        Pedido pedido = new Pedido(
                2L,
                500.00,
                "PENDENTE"
        );

        // Simulando falha no gateway
        doThrow(new PagamentoRecusadoException())
                .when(gateway)
                .cobrar(anyDouble());

        // Verificando se a exceção será lançada
        assertThrows(
                PagamentoRecusadoException.class,
                () -> service.processar(pedido)
        );

        // Verificando se o status continua pendente
        assertEquals("PENDENTE", pedido.getStatus());

        // Verificando se o repositório nunca foi acionado
        verify(pedidoRepository, never())
                .atualizar(any(Pedido.class));
    }
}
