package lista02;

import java.util.Scanner;

public class Exercicio05_Triangulos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro lado do triangulo: ");
		int lado1 = sc.nextInt();
		
		System.out.print("Digite o segundo lado do triangulo: ");
		int lado2 = sc.nextInt();
		
		System.out.print("Digite o terceiro lado do triangulo: ");
		int lado3 = sc.nextInt();
		
		
		if((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)){
			
			if((lado1 == lado2) && (lado2 == lado3)){
				System.out.println("Resultado: Triangulo equilatero");
			}else if((lado1 != lado2) && (lado1 != lado3) && (lado2 != lado3)){
				System.out.println("Resultado: Triangulo escaleno");
			}else{
				System.out.println("Resultado: Triangulo isosceles");
			}
			
		}else{
			System.out.println("Resultado: Os lados informados nao formam um triangulo");
		}
		
		sc.close();

	}
}