package poo.lista08.exercicio03;

public class SmsNotificacao extends Notificacao {

	public SmsNotificacao(String destinatario){
		super(destinatario);
	}

	@Override
	public void enviar(String mensagem){

		System.out.println("Enviando SMS para o numero " + destinatario + ": " + mensagem);
	}
}