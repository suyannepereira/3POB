package concorrencia.lista14.exercicio04;

import java.util.concurrent.CompletableFuture;

public class Main {

    public static void main(String[] args) {

        //primeira tarefa: buscar o pedido
        CompletableFuture<Double> pedido = CompletableFuture.supplyAsync(() -> {

            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                System.out.println("Busca interrompida");
            }

            System.out.println("Opedido 101 foi encontrado");

            return 150.0;
        });

        //segunda tarefa: calcular o frete
        CompletableFuture<Double> total = pedido.thenApply(valor -> {
            double frete = 25.0;
            return valor + frete;
        });

        //terceira tarefa: enviar confirmação
        CompletableFuture<Void> confirmacao = total.thenAccept(valor -> {

            System.out.println("O e-mail enviado com sucesso");

            System.out.println("Total da compra: R$ " + valor);
        });

        //outras atividades da thread principal
        System.out.println("Enquanto o pedido e processado...");
        System.out.println("O sistema continua funcionando");

        //esperando o processo terminar
        confirmacao.join();
    }
}