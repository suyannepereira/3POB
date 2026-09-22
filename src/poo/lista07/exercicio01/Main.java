package poo.lista07.exercicio01;

public class Main {

	public static void main(String[] args) {

		//Produto com 3 parâmetros
		Produto produtoA = new Produto("Arroz", 25.0, 10);

		//Produto com 2 parâmetros
		Produto produtoB = new Produto("Feijao", 8.0);

		System.out.println("Produto A:");
		System.out.println("Nome: " + produtoA.getNome());
		System.out.println("Preco: " + produtoA.getPreco());
		System.out.println("Estoque: " + produtoA.getQuantidadeEstoque());
		System.out.println("Valor total em estoque: " + produtoA.calcularValorTotalEmEstoque());

		System.out.println();

		System.out.println("Produto B:");
		System.out.println("Nome: " + produtoB.getNome());
		System.out.println("Preco: " + produtoB.getPreco());
		System.out.println("Estoque: " + produtoB.getQuantidadeEstoque());
		System.out.println("Valor total em estoque: " + produtoB.calcularValorTotalEmEstoque());

		System.out.println();

		//Tentando colocar o preço negativo
		System.out.println("Tentando alterar o preco do Produto A...");
		produtoA.setPreco(-10.0);

		System.out.println("Preco atual: " + produtoA.getPreco());
	}
}