package poo.lista08.exercicio03;

public class Notificacao {

	protected String destinatario;

	public Notificacao(String destinatario){
		this.destinatario = destinatario;
	}

	public void enviar(String mensagem) {
		System.out.println("Enviando notificacao para " + destinatario + ": " + mensagem);
	}
}