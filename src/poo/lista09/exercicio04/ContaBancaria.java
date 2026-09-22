package poo.lista09.exercicio04;

public abstract class ContaBancaria {

    private int numero;
    private double saldo;

    public ContaBancaria(int numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        saldo = saldo + valor;
    }

    public double consultarSaldo(){
        return saldo;
    }

    public abstract void cobrarTaxaMensal();

    protected void retirarSaldo(double valor){
        saldo = saldo - valor;
    }
}