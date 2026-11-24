
package poo.testesunitarios.exercicio05;

public class PagamentoRecusadoException extends RuntimeException {

    public PagamentoRecusadoException() {
        super("Pagamento recusado pelo gateway.");
    }

}
