package lista04;

import java.util.Scanner;

public class Exercicio04_BuscaLinear {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int[6];
		int i;
		
		for(i = 0; i < numeros.length; i++) {
			System.out.println("Digite um numero: ");
			numeros[i] = sc.nextInt();
		}
		
		System.out.println("Digite o numero que deseja buscar: ");
		int x = sc.nextInt();
		
		boolean encontrado = false;
		
		for(i = 0; i < numeros.length; i++) {
			
			if(numeros[i] == x) {
				System.out.println("Numero encontrado na posicao: " + i);
				encontrado = true;
				break;
			}
		}
		
		if(encontrado == false) {
			System.out.println("Numero nao encontrado");
		}
		
		sc.close();
	}
}

