package poo.lista09.exercicio01;

public class Pix implements MetodoPagamento {

    private String chavePix;

    public Pix(String chavePix){
        this.chavePix = chavePix;
    }

    @Override
    public void processarPagamento(double valor){
        System.out.println("O pagamento foi realizado via Pix");
        System.out.println("Valor: R$ " + valor);
    }

    @Override
    public String obterDetalhes(){
        return "Chave Pix: " + chavePix;
    }
}