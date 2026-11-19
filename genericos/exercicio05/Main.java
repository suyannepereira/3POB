package poo.genericos.exercicio05;

import java.util.ArrayList;
import java.util.List;

public class Main {

	 // Copia os elementos de uma lista para outra
    public static <T> void copiarElementos(
            List<? extends T> origem,
            List<? super T> destino) {

        for (T elemento : origem) {
            destino.add(elemento);
        }
    }

    public static void main(String[] args) {

        // Lista de origem: Integer
        List<Integer> origem = new ArrayList<>();

        origem.add(10);
        origem.add(20);
        origem.add(30);
        origem.add(40);


        // Lista de destino: Number
        List<Number> destino = new ArrayList<>();

        destino.add(100);


        // Copiando os elementos
        copiarElementos(origem, destino);


        // Exibindo a lista de origem
        System.out.println("Lista de origem: " + origem);

        // Exibindo a lista de destino
        System.out.println("Lista de destino: " + destino);


        // Outro exemplo: destino do tipo Object
        List<Object> destinoObjetos = new ArrayList<>();

        copiarElementos(origem, destinoObjetos);

        System.out.println("Destino Object: " + destinoObjetos);

    }
}
