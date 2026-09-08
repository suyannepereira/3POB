package lista02;

import java.util.Scanner;

public class Exercicio02_Maioridade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o ano do seu nascimento: ");
		int anoNasc = sc.nextInt();
		
		System.out.print("Digite o ano atual: ");
		int anoAtual = sc.nextInt();
		
		if((anoAtual - anoNasc) >= 18){
			System.out.println("Resultado: Maior de idade");
		}else {
			System.out.println("Resultado: Menor de idade");
		}
		sc.close();
	}
}
