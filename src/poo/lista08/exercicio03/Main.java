package poo.lista08.exercicio03;

public class Main {

	public static void processarEnvio(Notificacao notificacao, String texto){

		notificacao.enviar(texto);
	}

	public static void main(String[] args) {

		EmailNotificacao email = new EmailNotificacao("suyanne@email.com");

		SmsNotificacao sms = new SmsNotificacao("21999999999");

		PushNotificacao push = new PushNotificacao("celular123");

		processarEnvio(email, "A sua compra foi aprovada");

		processarEnvio(sms, "O seu codigo e 1234");

		processarEnvio(push, "Voce recebeu uma nova mensagem");
	}
}