package lista03;

import java.util.Scanner;

public class Exercicio04_Contagem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, i;
		int contP = 0, contI = 0;
		
		System.out.println("Digite o inicio do intervalo: ");
		a = sc.nextInt();
		
		System.out.println("Digite o fim do intervalo: ");
		b = sc.nextInt();
		
		for(i = a; i <= b; i++){
			if(i % 2 == 0) {
				contP++;
			}else {
				contI++;
			}
		}
		
		System.out.println("A quantidade de numeros pares e: " + contP);
		System.out.println("A quantidade de numeros impares e: " + contI);
		
		sc.close();
	}

}
