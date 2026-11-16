package concorrencia.lista14.exercicio01;

public class ContadorCrescente implements Runnable {

    @Override
    public void run() {

        for(int i = 1; i <= 10; i++){
            System.out.println("Crescente: " + i);

            try {
                Thread.sleep(200);

            } catch (InterruptedException e) {
                System.out.println("A contagem foi interrompida");
            }
        }
    }
}