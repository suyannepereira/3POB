package lista01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio02_Temperatura {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius: ");
		double C = sc.nextDouble();
		
		double F = (C * 1.8) + 32;
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("A temperatura em Fahrenheit e: " + df.format(F));
		
		sc.close();
	}
}
