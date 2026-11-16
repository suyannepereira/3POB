package arquivos.lista13.exercicio02;

import java.nio.file.Path;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Collectors;
import java.io.IOException;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Path arquivo = Path.of("servidor.log");

        try(Stream<String> linhas = Files.lines(arquivo)){
            List<String> erros = linhas
                    .filter(linha -> linha.startsWith("[ERROR]"))
                    .map(linha -> linha.replace("[ERROR] ", ""))
                    .collect(Collectors.toList());

            System.out.println("Total de erros: " + erros.size());

            System.out.println("\nMensagens de erro:");

            for(String erro : erros){
                System.out.println(erro);
            }

        } catch(IOException e){
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}