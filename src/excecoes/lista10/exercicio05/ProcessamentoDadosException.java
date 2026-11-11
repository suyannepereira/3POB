package excecoes.lista10.exercicio05;

public class ProcessamentoDadosException extends Exception {

    public ProcessamentoDadosException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
