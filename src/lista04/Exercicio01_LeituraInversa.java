package lista04;

import java.util.Scanner;

public class Exercicio01_LeituraInversa {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int[5];
		int i;
		
		for(i = 0; i < numeros.length; i++){
			System.out.println("Digite um numero: ");
			numeros[i] = sc.nextInt();
		}
		
		System.out.println("Numeros na ordem inversa:");
		
		for(i = numeros.length - 1; i >= 0; i--){
			System.out.println(numeros[i]);
		}
		
		sc.close();
	}

}

