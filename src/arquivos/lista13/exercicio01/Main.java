package arquivos.lista13.exercicio01;

import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.io.IOException;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        Path diretorio = Path.of("dados/relatorios");

        Path arquivo = diretorio.resolve("sumario.txt");

        try {
            //criando o diretório caso não exista
            Files.createDirectories(diretorio);

            //criando o conteúdo do relatório
            String texto = "RELATÓRIO DO SISTEMA\n"
                    + "--------------------\n"
                    + "Execução realizada com sucesso!\n"
                    + "Data e hora: " + LocalDateTime.now();

            //gravando o conteúdo no arquivo
            Files.writeString(arquivo, texto,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.TRUNCATE_EXISTING);

            System.out.println("Arquivo criado em: " + arquivo);

        } catch (IOException e) {

            System.out.println("Erro ao criar o arquivo: " + e.getMessage());
        }
    }
}