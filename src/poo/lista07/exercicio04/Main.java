package poo.lista07.exercicio04;

public class Main {

	public static void main(String[] args) {

		Carro carro = new Carro("Honda Civic", 2020);

		System.out.println("Modelo: " + carro.getModelo());
		System.out.println("Ano: " + carro.getAno());
		System.out.println("Velocidade: " + carro.getVelocidadeAtual());
		System.out.println("Esta em movimento? " + carro.isEmMovimento());

		System.out.println();

		carro.acelerar(50);

		System.out.println("Velocidade: " + carro.getVelocidadeAtual());
		System.out.println("Esta em movimento? " + carro.isEmMovimento());

		carro.frear(20);

		System.out.println("Velocidade: " + carro.getVelocidadeAtual());

		carro.frear(100);

		System.out.println("Velocidade: " + carro.getVelocidadeAtual());
	}
}