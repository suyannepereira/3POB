package arquivos.lista13.exercicio03;

import java.nio.file.Path;
import java.nio.file.Files;
import java.util.List;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        Path arquivo = Path.of("produtos.csv");

        double totalGeral = 0;

        try {
            //lendo todas as linhas do arquivo
            List<String> linhas = Files.readAllLines(arquivo);

            //começando da posição 1 para pular o cabeçalho
            for (int i = 1; i < linhas.size(); i++) {
                String linha = linhas.get(i);
                //separando os campos
                String[] dados = linha.split(",");
                String nome = dados[0];

                int quantidade = Integer.parseInt(dados[1]);

                double preco = Double.parseDouble(dados[2]);

                //calculando o valor total do produto
                double totalProduto = quantidade * preco;

                totalGeral = totalGeral + totalProduto;

                System.out.println("\nProduto: " + nome);
                System.out.println("Quantidade: " + quantidade);
                System.out.println("Preco: R$ " + preco);
                System.out.println("Total: R$ " + totalProduto);
            }

            System.out.println("\nO valor total do inventario: R$  e" + totalGeral);

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());

        } catch (NumberFormatException e) {
            System.out.println("Erro: formato numerico invalido.");
        }
    }
}