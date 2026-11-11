package excecoes.lista10.exercicio01;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Digite o primeiro numero: ");
            int n1 = sc.nextInt();

            System.out.print("Digite o segundo numero: ");
            int n2 = sc.nextInt();

            int resultado = n1 / n2;

            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {

            System.out.println("Erro: Nao e possivel dividir por zero");

        } catch (InputMismatchException e) {

            System.out.println("Erro: Digite apenas numeros inteiros");

        } finally {

            System.out.println("Operacao finalizada");
            sc.close();
        }
    }
}
