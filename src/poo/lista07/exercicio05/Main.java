package poo.lista07.exercicio05;

public class Main {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario(
				"Joao",
				"001",
				3000.00
		);

		funcionario.exibirDados();

		System.out.println();

		System.out.println("Tentando aumentar o salario...");
		funcionario.setSalario(3500.00);

		funcionario.exibirDados();

		System.out.println();

		System.out.println("Tentando diminuir o salario...");
		funcionario.setSalario(3000.00);

		funcionario.exibirDados();
	}
}