package excecoes.lista10.exercicio05;

import java.io.IOException;

public class ServicoArquivo {

    public void processarArquivo(String caminho) throws ProcessamentoDadosException {

        try {

            if (caminho == null || caminho.isEmpty()) {

                throw new IOException("O caminho do arquivo e invalido");
            }

            if (!caminho.endsWith(".txt")) {

                throw new IllegalArgumentException("O formato de arquivo e invalido");
            }

            System.out.println("Arquivo processado com sucesso!");

        } catch (Exception e) {

            throw new ProcessamentoDadosException("Erro ao processar o arquivo.", e);
        }
    }
}
