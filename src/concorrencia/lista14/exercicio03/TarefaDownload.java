package concorrencia.lista14.exercicio03;

import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;

public class TarefaDownload implements Callable<String> {

    private int id;

    public TarefaDownload(int id) {
        this.id = id;
    }

    @Override
    public String call() throws Exception {

        //tempo aleatório entre 500 e 1500 milissegundos
        int tempo = ThreadLocalRandom.current().nextInt(500, 1501);
        Thread.sleep(tempo);
        return "Arquivo " + id + " processado pela thread: " + Thread.currentThread().getName();
    }
}