package lista05;

import java.util.Scanner;

public class Exercicio01_ExibirMatriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		int i, j;
		
		for(i = 0; i < matriz.length; i++){
			for(j = 0; j < matriz[i].length; j++){
				System.out.println("Digite um numero: ");
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Matriz:");
		
		for(i = 0; i < matriz.length; i++){
			for(j = 0; j < matriz[i].length; j++){
				System.out.print(matriz[i][j] + " ");
			}
			
			System.out.println();
		}
		
		sc.close();
	}

}

