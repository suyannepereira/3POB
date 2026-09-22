package poo.lista07.exercicio04;

public class Carro {

	private String modelo;
	private int ano;
	private int velocidadeAtual = 0;

	public Carro(String modelo, int ano){
		this.modelo = modelo;
		this.ano = ano;
	}

	public String getModelo(){
		return modelo;
	}

	public void setModelo(String modelo){
		this.modelo = modelo;
	}

	public int getAno(){
		return ano;
	}

	public int getVelocidadeAtual(){
		return velocidadeAtual;
	}

	public void acelerar(int incremento){

		if(incremento > 0){
			velocidadeAtual += incremento;
		}
	}

	public void frear(int decremento){

		if(decremento > 0){
			velocidadeAtual -= decremento;

			if(velocidadeAtual < 0){
				velocidadeAtual = 0;
			}
		}
	}

	public boolean isEmMovimento(){
		return velocidadeAtual > 0;
	}
}