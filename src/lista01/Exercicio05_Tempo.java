package lista01;

import java.util.Scanner;

public class Exercicio05_Tempo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor total em segundos: ");
		int totalSeg = sc.nextInt();
		
		int horas = totalSeg / 3600;
		int minutos = (totalSeg % 3600) / 60;
		int segundos = totalSeg % 60;
		
		System.out.println(horas + " hora(s), " + minutos + " minuto(s) e " + segundos + " segundo(s) ");
		
		sc.close();
	}
}
