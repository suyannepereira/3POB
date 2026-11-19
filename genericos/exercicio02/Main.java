package poo.genericos.exercicio02;

public class Main {

	 public static void main(String[] args) {

	        // Primeiro par
	        Par<Integer, String> p1 = new Par<>(1, "Ativo");

	        // Segundo par
	        Par<Integer, String> p2 = new Par<>(1, "Ativo");

	        // Terceiro par
	        Par<Integer, String> p3 = new Par<>(2, "Inativo");


	        // Exibindo os pares
	        System.out.println("Primeiro par: " + p1);
	        System.out.println("Segundo par: " + p2);
	        System.out.println("Terceiro par: " + p3);


	        // Recuperando chave e valor
	        System.out.println("\nChave do primeiro par: " + p1.getChave());
	        System.out.println("Valor do primeiro par: " + p1.getValor());


	        // Comparando os pares
	        System.out.println("\nP1 é igual a P2? "
	                + Par.saoIguais(p1, p2));

	        System.out.println("P1 é igual a P3? "
	                + Par.saoIguais(p1, p3));


	        // Outro exemplo de combinação de tipos
	        Par<String, Double> produto = new Par<>("Notebook", 3500.00);

	        System.out.println("\nProduto: " + produto);

	    }
}
