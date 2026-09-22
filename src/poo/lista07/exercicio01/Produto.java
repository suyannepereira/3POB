package poo.lista07.exercicio01;

public class Produto {

	private String nome;
	private double preco;
	private int quantidadeEstoque;

	//Construtor com os 3 atributos
	public Produto(String nome, double preco, int quantidadeEstoque){
		this.nome = nome;
		this.preco = preco;
		this.quantidadeEstoque = quantidadeEstoque;
	}

	//Construtor sobrecarregado
	public Produto(String nome, double preco){
		this.nome = nome;
		this.preco = preco;
		this.quantidadeEstoque = 0;
	}

	//Getter do nome
	public String getNome(){
		return nome;
	}

	//Setter do nome
	public void setNome(String nome){
		this.nome = nome;
	}

	//Getter do preço
	public double getPreco(){
		return preco;
	}

	//Setter do preço
	public void setPreco(double preco){
		if(preco >= 0){
			this.preco = preco;
		}else{
			System.out.println("O preco nao pode ser negativo");
		}
	}

	//Getter da quantidade
	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	//Setter da quantidade
	public void setQuantidadeEstoque(int quantidadeEstoque){
		if(quantidadeEstoque >= 0){
			this.quantidadeEstoque = quantidadeEstoque;
		}else{
			System.out.println("A quantidade em estoque nao pode ser negativa");
		}
	}

	//Calcula o valor total em estoque
	public double calcularValorTotalEmEstoque(){
		return preco * quantidadeEstoque;
	}
}