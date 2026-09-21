package lista04;

import java.util.Scanner;

public class Exercicio03_Media {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double[] notas = new double[8];
		
		double soma = 0;
		
		int i;
		
		for(i = 0; i < notas.length; i++){
			System.out.println("Digite a nota do aluno: ");
			notas[i] = sc.nextDouble();
			
			soma += notas[i];
		}
		
		double media = soma / notas.length;
		
		System.out.println("Media da turma: " + media);
		
		System.out.println("Notas acima da media:");
		
		for(i = 0; i < notas.length; i++){
			
			if(notas[i] > media) {
				System.out.println(notas[i]);
			}
		}
		
		sc.close();
	}
}
