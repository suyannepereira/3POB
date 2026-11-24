
package poo.testesunitarios.exercicio04;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class NotificacaoServiceTest {

    @Mock
    private EmailSender emailSender;

    @InjectMocks
    private NotificacaoService service;

    @Captor
    private ArgumentCaptor<String> destinatarioCaptor;

    @Captor
    private ArgumentCaptor<String> assuntoCaptor;

    @Captor
    private ArgumentCaptor<String> corpoCaptor;

    @Test
    public void testarNotificacaoBoasVindas() {

        // Criando usuário
        Usuario usuario = new Usuario(
                "Ana Silva",
                "ana@email.com"
        );

        // Executando o método
        service.notificarBoasVindas(usuario);

        // Capturando os argumentos enviados
        verify(emailSender).enviar(
                destinatarioCaptor.capture(),
                assuntoCaptor.capture(),
                corpoCaptor.capture()
        );

        // Validando o destinatário
        assertEquals(
                "ana@email.com",
                destinatarioCaptor.getValue()
        );

        // Validando o assunto
        assertTrue(
                assuntoCaptor.getValue().contains("Bem-vindo")
        );

        // Validando o corpo
        assertTrue(
                corpoCaptor.getValue().contains("Ana")
        );
    }
}
