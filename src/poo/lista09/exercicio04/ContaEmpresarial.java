package poo.lista09.exercicio04;

public class ContaEmpresarial extends ContaBancaria {

    public ContaEmpresarial(int numero, double saldo){
        super(numero, saldo);
    }

    @Override
    public void cobrarTaxaMensal(){

        double taxa = 30.00 + (consultarSaldo() * 0.005);

        retirarSaldo(taxa);
    }
}