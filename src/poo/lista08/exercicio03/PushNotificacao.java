package poo.lista08.exercicio03;

public class PushNotificacao extends Notificacao {

	public PushNotificacao(String destinatario){
		super(destinatario);
	}

	@Override
	public void enviar(String mensagem){

		System.out.println("Enviando Push Notification para o dispositivo " + destinatario + ": " + mensagem);
	}
}