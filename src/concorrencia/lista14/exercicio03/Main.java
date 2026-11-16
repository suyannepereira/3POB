package concorrencia.lista14.exercicio03;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) {

        // Criando um pool com 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        List<Future<String>> resultados = new ArrayList<>();

        //enviando as 6 tarefas
        for(int i = 1; i <= 6; i++) {
            TarefaDownload tarefa = new TarefaDownload(i);
            Future<String> resultado = executor.submit(tarefa);
            resultados.add(resultado);
        }

        //encerrando o envio de novas tarefas
        executor.shutdown();

        try {
            //xibindo os resultados
            for(Future<String> resultado : resultados){
                System.out.println(resultado.get());
            }

        } catch (Exception e) {
            System.out.println("Erro ao processar download");
        }
    }
}