package streams.lista12.exercicio04;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> textos = Arrays.asList("java", "programacao", "eclipse");

        //invertendo os textos
        List<String> invertidos = UtilTexto.processarLista(
                textos,
                texto -> new StringBuilder(texto).reverse().toString()
        );

        System.out.println("Textos invertidos:");
        System.out.println(invertidos);

        //colocando entre colchetes
        List<String> colchetes = UtilTexto.processarLista(textos, texto -> "[" + texto + "]");

        System.out.println("\nTextos entre colchetes:");
        System.out.println(colchetes);

        //transformando em maiúsculos
        List<String> maiusculos = UtilTexto.processarLista(
                textos,
                String::toUpperCase
        );

        System.out.println("\nTextos em maiusculos:");
        System.out.println(maiusculos);
    }
}