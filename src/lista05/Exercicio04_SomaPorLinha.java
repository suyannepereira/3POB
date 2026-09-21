package lista05;

import java.util.Scanner;

public class Exercicio04_SomaPorLinha {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] matriz = new int[4][3];
		int[] somaLinhas = new int[4];
		int i, j;
		
		for(i = 0; i < matriz.length; i++){
			for(j = 0; j < matriz[i].length; j++){
				System.out.println("Digite um numero: ");
				matriz[i][j] = sc.nextInt();
			}
		}
		
		for(i = 0; i < matriz.length; i++){
			int soma = 0;
			
			for(j = 0; j < matriz[i].length; j++){
				soma += matriz[i][j];
			}
			
			somaLinhas[i] = soma;
		}
		
		for(i = 0; i < somaLinhas.length; i++){
			System.out.println("Soma da linha " + i + ": " + somaLinhas[i]);
		}
		
		sc.close();
	}
}

