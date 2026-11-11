package excecoes.lista10.exercicio05;

public class Main {

    public static void main(String[] args) {

        ServicoArquivo servico = new ServicoArquivo();

        try {

            servico.processarArquivo("");

        } catch (ProcessamentoDadosException e) {

            System.out.println("Mensagem principal: " + e.getMessage());

            System.out.println("Motivo original: " + e.getCause().getMessage());
        }
    }
}
