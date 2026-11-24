
package poo.testesunitarios.exercicio05;

public class ProcessadorPagamentoService {

    private GatewayPagamento gateway;
    private PedidoRepository pedidoRepository;

    // Construtor
    public ProcessadorPagamentoService(
            GatewayPagamento gateway,
            PedidoRepository pedidoRepository) {

        this.gateway = gateway;
        this.pedidoRepository = pedidoRepository;
    }

    // Processar pagamento
    public void processar(Pedido pedido) {

        // Realizar cobrança
        gateway.cobrar(pedido.getValor());

        // Se a cobrança funcionar, alterar o status
        pedido.setStatus("PAGO");

        // Atualizar pedido no repositório
        pedidoRepository.atualizar(pedido);
    }
}
