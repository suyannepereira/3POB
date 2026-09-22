package poo.lista09.exercicio02;

public class Main {

    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo("Azul", 5, 3);

        Circulo circulo = new Circulo("Vermelho", 2);

        retangulo.exibirCor();
        System.out.println("Area: " + retangulo.calcularArea());

        System.out.println();

        circulo.exibirCor();
        System.out.println("Area: " + circulo.calcularArea());
    }
}