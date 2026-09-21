package lista05;

import java.util.Scanner;

public class Exercicio03_Localizacao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[][] matriz = new int[3][4];
		int i, j;
		
		for(i = 0; i < matriz.length; i++) {
			for(j = 0; j < matriz[i].length; j++) {
				System.out.println("Digite um numero: ");
				matriz[i][j] = sc.nextInt();
			}
		}
		
		int maior = matriz[0][0];
		int linhaMaior = 0;
		int colunaMaior = 0;
		
		for(i = 0; i < matriz.length; i++){
			for(j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] > maior){
					maior = matriz[i][j];
					linhaMaior = i;
					colunaMaior = j;
				}
			}
		}
		
		System.out.println("Maior valor: " + maior);
		System.out.println("Linha: " + linhaMaior);
		System.out.println("Coluna: " + colunaMaior);
		
		sc.close();
	}

}

