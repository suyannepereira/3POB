
package poo.testesunitarios.exercicio04;

public interface EmailSender {

    void enviar(
            String destinatario,
            String assunto,
            String corpo
    );

}
