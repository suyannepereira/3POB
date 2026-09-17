package lista03;

import java.util.Scanner;

public class Exercicio03_Validacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int senha;
		do {
			System.out.println("Digite uma senha: ");
			senha = sc.nextInt();
			
			if(senha == 2026){
				System.out.println("Acesso Permitido!");
			}else {
				System.out.println("Senha Incorreta! Tente novamente.");
			}
		} while(senha != 2026);
		
		sc.close();
	}

}
