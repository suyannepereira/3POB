package poo.lista07.exercicio02;

public class Main {

	public static void main(String[] args) {

		ContaBancaria conta = new ContaBancaria("12345", "Maria");

		System.out.println("Numero da conta: " + conta.getNumeroConta());
		System.out.println("Titular: " + conta.getTitular());
		System.out.println("Saldo: " + conta.getSaldo());

		System.out.println();

		conta.depositar(500);

		System.out.println("Saldo: " + conta.getSaldo());

		conta.sacar(150);

		System.out.println("Saldo: " + conta.getSaldo());

		System.out.println();

		conta.setTitular("Maria Silva");

		System.out.println("Novo titular: " + conta.getTitular());
	}
}