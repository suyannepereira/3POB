package concorrencia.lista14.exercicio02;

public class Main {

    public static void main(String[] args) {

        ContadorAcessos contador = new ContadorAcessos();

        Thread[] threads = new Thread[5];

        //criando as 5 threads
        for (int i = 0; i < 5; i++){
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 1000; j++){
                    contador.incrementar();
                }
            });
        }

        //iniciando as threads
        for(int i = 0; i < 5; i++){
            threads[i].start();
        }

        //esperando todas terminarem
        try {
            for (int i = 0; i < 5; i++){
                threads[i].join();
            }

        } catch (InterruptedException e) {
            System.out.println("O processo foi interrompido");
        }

        System.out.println("Sem sincronização: " +
                contador.getContador());

        //testando com a sincronização
        ContadorAcessos contadorSeguro = new ContadorAcessos();

        Thread[] threadsSeguras = new Thread[5];

        for(int i = 0; i < 5; i++){
            threadsSeguras[i] = new Thread(() -> {
                for(int j = 0; j < 1000; j++){
                    contadorSeguro.incrementarSeguro();
                }
            });
        }

        for(int i = 0; i < 5; i++) {
            threadsSeguras[i].start();
        }

        try {
            for(int i = 0; i < 5; i++) {
                threadsSeguras[i].join();
            }

        } catch (InterruptedException e) {
            System.out.println("O processo interrompido");
        }

        System.out.println("Com sincronizacao: " + contadorSeguro.getContador());
    }
}