package colecoes.lista11.exercicio03;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> palavras = new HashMap<>();

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        //transformando em letras minúsculas
        frase = frase.toLowerCase();

        //separando as palavras
        String[] texto = frase.split("\\s+");

        //contando as palavras
        for(int i = 0; i < texto.length; i++){
            String palavra = texto[i];
            int quantidade = palavras.getOrDefault(palavra, 0);
            palavras.put(palavra, quantidade + 1);
        }

        //exibindo as palavras e suas frequências
        System.out.println("\nFrequência das palavras:");

        for(String palavra : palavras.keySet()){
            System.out.println(palavra + ": " + palavras.get(palavra));
        }

        sc.close();
    }
}