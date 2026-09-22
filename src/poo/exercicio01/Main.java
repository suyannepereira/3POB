package poo.exercicio01;

public class Main {

	public static void main(String[] args) {
		
		Livro livro1 = new Livro();
		
		livro1.titulo = "Harry Potter";
		livro1.autor = "J.K. Rowling";
		livro1.numeroPaginas = 300;
		
		Livro livro2 = new Livro();
		
		livro2.titulo = "O Hobbit";
		livro2.autor = "J.R.R. Tolkien";
		livro2.numeroPaginas = 310;
		
		livro1.exibirInformacoes();
		
		System.out.println();
		
		livro2.exibirInformacoes();

	}

}
