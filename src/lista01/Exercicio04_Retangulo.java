package lista01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio04_Retangulo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a base: ");
		double base = sc.nextDouble();
		
		System.out.println("Digite a altura: ");
		double altura = sc.nextDouble();
		 
		double area = (base * altura);
			 
		double perimetro = (2  * (base + altura));

		DecimalFormat df = new DecimalFormat("0.0");
		
		System.out.println("A area e: " + df.format(area));
		System.out.println("A altura e: " + df.format(perimetro));
		
		sc.close();
	}
}
