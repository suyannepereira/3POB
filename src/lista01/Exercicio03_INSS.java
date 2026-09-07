package lista01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio03_INSS {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da hora de trabalho: ");
		double horaTrab = sc.nextDouble();
		
		System.out.println("Digite a quantidade de horas trabalhadas no mes: ");
		double quantTrab = sc.nextDouble();
		 
		double salarioB = horaTrab * quantTrab;
		double inss = salarioB * 0.10;
		double salarioL = salarioB - inss;
		
		DecimalFormat df = new DecimalFormat("0.0");
		
		System.out.println("O salario bruto e: " + df.format(salarioB));
		System.out.println("O salario liquido final e: " + df.format(salarioL));
		
		sc.close();
	}
}
