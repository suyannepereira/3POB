
package poo.testesunitarios.exercicio04;

public class NotificacaoService {

    private EmailSender emailSender;

    //construtor
    public NotificacaoService(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    //nviar notificação de boas-vindas
    public void notificarBoasVindas(Usuario usuario) {

        String destinatario = usuario.getEmail();

        String primeiroNome = usuario.getNome().split(" ")[0];

        String assunto = "Bem-vindo ao nosso sistema";

        String corpo = "Ola, " + primeiroNome + " Seja muito bem-vindo ao nosso sistema";

        emailSender.enviar(destinatario, assunto, corpo);
    }
}
