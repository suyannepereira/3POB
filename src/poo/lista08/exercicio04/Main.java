package poo.lista08.exercicio04;

public class Main {

	public static void main(String[] args) {

		FiguraGeometrica[] figuras = new FiguraGeometrica[3];

		figuras[0] = new Quadrado(5);
		figuras[1] = new Retangulo(4, 6);
		figuras[2] = new Circulo(3);

		for (int i = 0; i < figuras.length; i++){
			System.out.printf("Area: %.2f%n", figuras[i].calcularArea());
		}
	}
}