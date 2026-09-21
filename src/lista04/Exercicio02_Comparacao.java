package lista04;

import java.util.Scanner;

public class Exercicio02_Comparacao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int[10];
		int i;
		
		for(i = 0; i < numeros.length; i++){
			System.out.println("Digite um numero: ");
			numeros[i] = sc.nextInt();
		}
		
		int maior = numeros[0];
		int menor = numeros[0];
		
		int posMaior = 0;
		int posMenor = 0;
		
		for(i = 1; i < numeros.length; i++) {
			
			if(numeros[i] > maior) {
				maior = numeros[i];
				posMaior = i;
			}
			
			if(numeros[i] < menor){
				menor = numeros[i];
				posMenor = i;
			}
		}
		
		System.out.println("Maior valor: " + maior);
		System.out.println("Posicao do maior: " + posMaior);
		
		System.out.println("Menor valor: " + menor);
		System.out.println("Posicao do menor: " + posMenor);
		
		sc.close();
	}

}

