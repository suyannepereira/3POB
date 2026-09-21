package lista05;

import java.util.Scanner;

public class Exercicio05_MatrizTransposta {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] matriz = new int[2][3];
		int[][] transposta = new int[3][2];
		int i, j;
		
		for(i = 0; i < matriz.length; i++){
			for(j = 0; j < matriz[i].length; j++){
				System.out.println("Digite um numero: ");
				matriz[i][j] = sc.nextInt();
			}
		}
		
		for(i = 0; i < matriz.length; i++){
			for(j = 0; j < matriz[i].length; j++){
				transposta[j][i] = matriz[i][j];
			}
		}
		
		System.out.println("Matriz original:");
		
		for(i = 0; i < matriz.length; i++){
			for(j = 0; j < matriz[i].length; j++){
				System.out.print(matriz[i][j] + " ");
			}
			
			System.out.println();
		}
		
		System.out.println("Matriz transposta:");
		
		for(i = 0; i < transposta.length; i++){
			for(j = 0; j < transposta[i].length; j++){
				System.out.print(transposta[i][j] + " ");
			}
			
			System.out.println();
		}
		
		sc.close();
	}
}
