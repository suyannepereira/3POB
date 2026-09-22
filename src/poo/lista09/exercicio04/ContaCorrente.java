package poo.lista09.exercicio04;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(int numero, double saldo){
        super(numero, saldo);
    }

    @Override
    public void cobrarTaxaMensal(){
        retirarSaldo(15.00);
    }
}