package lista02;

import java.util.Scanner;

public class Exercicio01_Paridade {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int num = sc.nextInt();
		
		if(num % 2 == 0){
			System.out.print("Resultado: numero par");
		}else {
			System.out.print("Resultado: numero impar");
		}
		sc.close();
	}
}
