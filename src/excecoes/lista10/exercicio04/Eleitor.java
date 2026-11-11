package excecoes.lista10.exercicio04;

public class Eleitor {

    public void cadastrar(String nome, int idade) {

        if (idade < 0 || idade > 130) {

            throw new IdadeInvalidaException("Idade invalida para cadastro");

        } else {

            System.out.println("Eleitor cadastrado com sucesso!");
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
        }
    }
}