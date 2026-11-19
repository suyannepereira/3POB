package poo.genericos.exercicio01;

public class Main {
	
	 public static void main(String[] args) {

	        // Caixa que armazena números inteiros
	        Caixa<Integer> caixaNumero = new Caixa<>();

	        caixaNumero.guardar(100);

	        System.out.println("Número: " + caixaNumero.recuperar());


	        // Caixa que armazena textos
	        Caixa<String> caixaTexto = new Caixa<>();

	        caixaTexto.guardar("Aprendendo Generics");

	        System.out.println("Texto: " + caixaTexto.recuperar());


	        // Caixa que armazena produtos
	        Caixa<Produto> caixaProduto = new Caixa<>();

	        Produto produto = new Produto("Notebook", 3500.00);

	        caixaProduto.guardar(produto);

	        System.out.println("Produto: " + caixaProduto.recuperar());


	        // Verificando se a caixa está vazia
	        System.out.println("\nA caixa de numeros esta vazia? "
	                + caixaNumero.isVazia());


	        // Limpando a caixa de números
	        caixaNumero.limpar();

	        System.out.println("Depois de limpar, esta vazia? " + caixaNumero.isVazia());

	    }
}
