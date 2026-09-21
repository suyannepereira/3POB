package lista04;

import java.util.Scanner;

public class Exercicio05_Separacao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int[10];
		int[] pares = new int[10];
		int[] impares = new int[10];
		
		int posPar = 0;
		int posImpar = 0;
		int i;
		
		for(i = 0; i < numeros.length; i++){
			System.out.println("Digite um numero: ");
			numeros[i] = sc.nextInt();
		}
		
		for(i = 0; i < numeros.length; i++){
			if(numeros[i] % 2 == 0){
				pares[posPar] = numeros[i];
				posPar++;
			}else{
				impares[posImpar] = numeros[i];
				posImpar++;
			}
		}
		
		System.out.println("Numeros pares:");
		
		for(i = 0; i < posPar; i++) {
			System.out.println(pares[i]);
		}
		
		System.out.println("Numeros impares:");
		
		for(i = 0; i < posImpar; i++) {
			System.out.println(impares[i]);
		}
		
		sc.close();
	}
}
