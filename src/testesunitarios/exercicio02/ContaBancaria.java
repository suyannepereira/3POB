
package poo.testesunitarios.exercicio02;

public class ContaBancaria {

    private double saldo;

    // Construtor
    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    // Depositar dinheiro
    public void depositar(double valor) {

        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do depósito deve ser positivo");
        }

        saldo += valor;
    }

    // Sacar dinheiro
    public void sacar(double valor) {

        if (valor <= 0) {
            throw new IllegalArgumentException( "O valor do saque deve ser positivo");
        }

        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar o saque");
        }

        saldo -= valor;
    }

    // Consultar saldo
    public double getSaldo() {
        return saldo;
    }
}
