package lista02;

import java.util.Scanner;

public class Exercicio04_MaiorDeTres {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeira numero: ");
		int num1 = sc.nextInt();
		
		System.out.print("Digite o segundo numero: ");
		int num2 = sc.nextInt();
		
		System.out.print("Digite o terceiro numero: ");
		int num3 = sc.nextInt();
		
		if((num1 >= num2) && (num1 >= num3)){
			
			System.out.println("O maior numero e: " + num1);
			
			}else if(num2 >= num3){
			
				System.out.println("O maior numero e: " + num2);
				
			}else{
				
				System.out.println("O maior numero e: " + num3);
			}
		
		sc.close();

	}
}
