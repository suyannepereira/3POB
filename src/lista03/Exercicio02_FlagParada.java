package lista03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio02_FlagParada {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cont = 0, soma = 0;
		
		System.out.println("Digite um numero: ");
		int num = sc.nextInt();
	    

        while (num >= 0) {
        	cont++;
        	soma += num;
        	System.out.println("Digite um numero: ");
    		num = sc.nextInt();
    	    
        }
        
        DecimalFormat df = new DecimalFormat("0.00");
        
        System.out.println("A quantidade de numeros digitados foi: " + cont);
        System.out.println("A soma de numeros e: " + soma);
        
        if(cont > 0){
            double media = (double) soma / cont;
            System.out.println("Media: " + df.format(media));
        }else{
            System.out.println("Nenhum numero positivo foi digitado");
        }
        sc.close();
	}

}
