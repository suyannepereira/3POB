package poo.genericos.exercicio04;

import java.util.ArrayList;
import java.util.List;

public class Main {

	// Recebe uma lista de figuras ou de suas subclasses
    public static double somarAreas(List<? extends Figura> listaFiguras) {

        double soma = 0;

        for (Figura figura : listaFiguras) {
            soma += figura.calcularArea();
        }

        return soma;
    }

    public static void main(String[] args) {

        // Lista de quadrados
        List<Quadrado> quadrados = new ArrayList<>();

        quadrados.add(new Quadrado(4));
        quadrados.add(new Quadrado(5));


        // Lista de círculos
        List<Circulo> circulos = new ArrayList<>();

        circulos.add(new Circulo(2));
        circulos.add(new Circulo(3));


        // Calculando as áreas
        System.out.println("Área dos quadrados: "
                + somarAreas(quadrados));

        System.out.println("Área dos círculos: "
                + somarAreas(circulos));


        // Lista de figuras
        List<Figura> figuras = new ArrayList<>();

        figuras.add(new Quadrado(3));
        figuras.add(new Circulo(2));

        System.out.println("Área de todas as figuras: "
                + somarAreas(figuras));

    }
}
