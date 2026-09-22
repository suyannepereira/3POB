package poo.lista08.exercicio05;

public class Main {

	public static void main(String[] args) {

		ContaPoupanca poupanca = new ContaPoupanca("001", 5);

		poupanca.depositar(1000);
		System.out.println("Saldo da poupanca: " + poupanca.getSaldo());

		poupanca.aplicarRendimento();
		System.out.println("Saldo apos o rendimento: " + poupanca.getSaldo());

		poupanca.sacar(200);
		System.out.println("Saldo apos o saque: " + poupanca.getSaldo());

		System.out.println();

		ContaCorrente corrente = new ContaCorrente("002", 500);

		corrente.depositar(100);
		System.out.println("Saldo da corrente: " + corrente.getSaldo());

		corrente.sacar(200);
		System.out.println("Saldo apos o saque: " + corrente.getSaldo());
	}
}