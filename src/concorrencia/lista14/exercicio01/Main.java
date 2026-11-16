package concorrencia.lista14.exercicio01;

public class Main {

    public static void main(String[] args) {

        ContadorCrescente crescente = new ContadorCrescente();

        ContadorRegressivo regressivo = new ContadorRegressivo();

        Thread t1 = new Thread(crescente);

        Thread t2 = new Thread(regressivo);

        //iniciando as threads
        t1.start();
        t2.start();

        try {
            //esperando as duas threads terminarem
            t1.join();
            t2.join();

        } catch (InterruptedException e) {

            System.out.println("O processo foiinterrompido");
        }

        System.out.println("As contagens foram finalizadas");
    }
}