package poo.lista08.exercicio03;

public class EmailNotificacao extends Notificacao {

	public EmailNotificacao(String destinatario){
		super(destinatario);
	}

	@Override
	public void enviar(String mensagem){

		System.out.println("Enviando E-mail para " + destinatario + ": " + mensagem);
	}
}