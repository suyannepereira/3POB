package lista03;

import java.util.Scanner;

public class Exercicio05_Fatorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, i;
		long fat = 1;
		
		System.out.println("Digite um numero: ");
		n = sc.nextInt();
		
		for(i = n; i >= 1; i--){
			fat *= i;
		}
		
		System.out.print("O fatorial de " + n + " e: " + fat);
		
		sc.close();
	}
}
