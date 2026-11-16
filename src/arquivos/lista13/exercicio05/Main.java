package arquivos.lista13.exercicio05;

import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collectors;
import java.io.IOException;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Path arquivoOriginal = Path.of("clientes_bruto.txt");

        Path arquivoNovo = Path.of("clientes_padronizado.txt");

        try (Stream<String> linhas = Files.lines(arquivoOriginal)) {
            //limpando e organizando os nomes
            List<String> clientes = linhas
                    .map(nome -> nome.trim())
                    .filter(nome -> !nome.isBlank())
                    .map(nome -> nome.substring(0, 1).toUpperCase() + nome.substring(1).toLowerCase())
                    .collect(Collectors.toList());

            //gravando os nomes no novo arquivo
            Files.write(arquivoNovo, clientes,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.TRUNCATE_EXISTING);

            System.out.println("Arquivo criado com sucesso!");

        } catch (IOException e) {
            System.out.println("Erro ao processar arquivo: " + e.getMessage());
        }
    }
}