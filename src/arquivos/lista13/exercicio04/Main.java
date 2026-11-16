package arquivos.lista13.exercicio04;

import java.nio.file.Path;
import java.nio.file.Files;
import java.util.stream.Stream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        Path diretorio = Path.of("src");

        long[] tamanhoTotal = {0};

        try (Stream<Path> arquivos = Files.walk(diretorio)) {
            arquivos
                    //selecionando somente arquivos
                    .filter(caminho -> Files.isRegularFile(caminho))

                    //selecionando arquivos Java
                    .filter(caminho -> caminho.toString().endsWith(".java"))

                    .forEach(caminho -> {

                        try {
                            //pegando o tamanho do arquivo
                            long tamanho = Files.size(caminho);

                            //somando os tamanhos
                            tamanhoTotal[0] = tamanhoTotal[0] + tamanho;

                            //exibindo o caminho relativo
                            System.out.println("Arquivo: " + diretorio.relativize(caminho));

                            System.out.println("Tamanho: " + tamanho + " bytes\n");

                        } catch (IOException e) {
                            System.out.println("Erro ao consultar arquivo.");
                        }
                    });

            System.out.println("Tamanho total: " +
                    tamanhoTotal[0] + " bytes");

        } catch (IOException e) {
            System.out.println("Erro ao acessar o diretorio: " + e.getMessage());
        }
    }
}