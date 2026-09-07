package lista01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio01_Media {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		double nota1 = sc.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		double nota2 = sc.nextDouble();
		
		System.out.println("Digite a terceira nota: ");
		double nota3 = sc.nextDouble();
	
	    double soma = nota1 + nota2 + nota3;
	    
	    double media = soma/3;
	    
	    DecimalFormat df = new DecimalFormat("0.00");
	    
	    System.out.println("A media da notas e: " + df.format(media));
	    
	    sc.close();

	}
}
