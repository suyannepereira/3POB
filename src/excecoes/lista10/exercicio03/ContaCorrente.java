package excecoes.lista10.exercicio03;

public class ContaCorrente {

    private String numero;
    private double saldo;

    public ContaCorrente(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {

        if (valor > saldo) {

            throw new SaldoInsuficienteException("Saldo insuficiente para realizar o saque");

        } else {

            saldo = saldo - valor;

            System.out.println("Saque realizado com sucesso!");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
