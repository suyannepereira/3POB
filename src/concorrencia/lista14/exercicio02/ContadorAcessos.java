package concorrencia.lista14.exercicio02;

public class ContadorAcessos {

    private int contador = 0;

    //sem sincronização
    public void incrementar() {
        contador++;
    }

    //com sincronização
    public synchronized void incrementarSeguro() {
        contador++;
    }

    public int getContador() {
        return contador;
    }
}