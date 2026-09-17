package lista03;

import java.util.Scanner;

public class Exercicio01_Tabuada {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int num = sc.nextInt();
		
		int i;
		
		for(i = 0; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + num * i);
		}
		
		sc.close();
	}

}
