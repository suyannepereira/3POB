package poo.lista09.exercicio01;

public class CartaoCredito implements MetodoPagamento {

    private String numeroCartao;
    private double limite;

    public CartaoCredito(String numeroCartao, double limite){
        this.numeroCartao = numeroCartao;
        this.limite = limite;
    }

    @Override
    public void processarPagamento(double valor){

        if(valor <= limite){
            limite = limite - valor;
            System.out.println("O pagamento foi realizado no cartao");
            System.out.println("Valor: R$ " + valor);
        }else{
            System.out.println("Limite insuficiente");
        }
    }

    @Override
    public String obterDetalhes(){
        return "Cartao: " + numeroCartao + "  Limite: R$ " + limite;
    }
}