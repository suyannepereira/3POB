package poo.exercicio02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o raio: ");
		double raio = sc.nextDouble();
		
		Circulo circulo = new Circulo();
		
		circulo.raio = raio;
		
		double area = circulo.calcularArea();
		double perimetro = circulo.calcularPerimetro();
		
		System.out.printf("Area: %.2f%n", area);
		System.out.printf("Perimetro: %.2f%n", perimetro);
		
		sc.close();
	}
}