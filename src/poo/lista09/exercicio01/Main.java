package poo.lista09.exercicio01;

public class Main {

    public static void finalizarCompra(MetodoPagamento metodo, double total){

        metodo.processarPagamento(total);

        System.out.println(metodo.obterDetalhes());
    }

    public static void main(String[] args) {

        CartaoCredito cartao = new CartaoCredito("1234-5678", 1000);

        Pix pix = new Pix("suyanne@email.com");

        finalizarCompra(cartao, 200);

        System.out.println();

        finalizarCompra(pix, 150);
    }
}