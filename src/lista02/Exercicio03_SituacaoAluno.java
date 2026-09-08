package lista02;

import java.util.Scanner;

public class Exercicio03_SituacaoAluno {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		double nota1 = sc.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		double nota2 = sc.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if(media >= 7.0){
			System.out.println("Resultado: Aluno aprovado");
			}else if((media >= 5.0) && (media <=6.9)){
			
				System.out.println("Resultado: Aluno em recuperacao");
				
			}else{
				System.out.println("Resultado: Aluno reprovado");
			}
		
		sc.close();

	}
}
