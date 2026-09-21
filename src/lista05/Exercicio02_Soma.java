package lista05;

import java.util.Scanner;

public class Exercicio02_Soma {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double[][] matriz = new double[4][4];
		
		double soma = 0;
		
		int i, j;
		
		for(i = 0; i < matriz.length; i++){
			for(j = 0; j < matriz[i].length; j++){
				System.out.println("Digite um numero: ");
				matriz[i][j] = sc.nextDouble();
			}
		}
		
		for(i = 0; i < matriz.length; i++){
			soma += matriz[i][i];
		}
		
		System.out.println("Soma da diagonal principal: " + soma);
		
		sc.close();
	}

}


