package concorrencia.lista14.exercicio05;

import java.util.concurrent.CompletableFuture;

public class Main {

    public static void main(String[] args) {

        //serviço A: passagem aérea
        CompletableFuture<Double> passagem = CompletableFuture.supplyAsync(() -> {

            try {

                Thread.sleep(1200);

            } catch (InterruptedException e) {
                System.out.println("A consulta interrompida");
            }

            System.out.println("A cotacao da passagem foi concluida");

            return 1500.0;
        });

        //serviço B: hospedagem
        CompletableFuture<Double> hospedagem = CompletableFuture.supplyAsync(() -> {

            try {

                Thread.sleep(800);

            } catch (InterruptedException e) {
                System.out.println("A consulta foi interrompida");
            }

            System.out.println("A cotacao da hospedagem foi concluida");

            return 900.0;
        });

        //juntando os resultados
        CompletableFuture<String> pacote = passagem.thenCombine(
                hospedagem,
                (valorPassagem, valorHospedagem) -> {
                    double total = valorPassagem + valorHospedagem;
                    return "Valor da passagem: R$ " + valorPassagem + "\nValor da hospedagem: R$ " + valorHospedagem + "\nValor total da viagem: R$ " + total;
                }
        );

        //tratamento de erros
        pacote = pacote.exceptionally(erro -> {

            return "Nao foi possivel realizar a cotacao";
        });

        //exibindo o resultado
        pacote.thenAccept(resultado -> {

            System.out.println("\n" + resultado);
        }).join();

    }
}