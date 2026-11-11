package excecoes.lista10.exercicio02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] numeros = {"10", "25", "abc", "50"};

        try {

            System.out.print("Digite um indice de 0 a 3: ");
            int indice = sc.nextInt();

            int numero = Integer.parseInt(numeros[indice]);

            System.out.println("Numero convertido: " + numero);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Erro: Esse indice nao existe");

        } catch (NumberFormatException e) {

            System.out.println("Erro: Esse valor nao e um numero valido.");

        }

        sc.close();
    }
}
