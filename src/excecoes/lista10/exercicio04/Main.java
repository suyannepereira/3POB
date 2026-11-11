package excecoes.lista10.exercicio04;

public class Main {

    public static void main(String[] args) {

        Eleitor eleitor = new Eleitor();

        try {

            eleitor.cadastrar("Aurora", 25);

            eleitor.cadastrar("Bento", 150);

        } catch (IdadeInvalidaException e) {

            System.out.println("Erro: " + e.getMessage());

        }

    }
}
