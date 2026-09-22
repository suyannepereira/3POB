package poo.lista07.exercicio03;

public class Main {

	public static void main(String[] args) {

		Retangulo retangulo1 = new Retangulo(5, 10);

		System.out.println("Largura: " + retangulo1.getLargura());
		System.out.println("Altura: " + retangulo1.getAltura());
		System.out.println("Area: " + retangulo1.calcularArea());
		System.out.println("Perimetro: " + retangulo1.calcularPerimetro());

		System.out.println();

		Retangulo retangulo2 = new Retangulo(-5, 10);

		System.out.println("Largura: " + retangulo2.getLargura());
		System.out.println("Altura: " + retangulo2.getAltura());
		System.out.println("Area: " + retangulo2.calcularArea());
	}
}