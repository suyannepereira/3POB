package poo.exercicio04;

public class Main {

	public static void main(String[] args) {
		
	Funcionario funcionario = new Funcionario();
		
		funcionario.nome = "Maria";
		funcionario.cargo = "Analista";
		funcionario.salarioBruto = 2000;
		
		System.out.println("Nome: " + funcionario.nome);
		System.out.println("Cargo: " + funcionario.cargo);
		System.out.println("Salario antes do aumento: " + funcionario.salarioBruto);
		
		funcionario.aplicarAumento(10);
		
		System.out.println("Salario depois do aumento: " + funcionario.salarioBruto);
		
		double salarioLiquido = funcionario.calcularSalarioLiquido(200);
		
		System.out.println("Salario liquido: " + salarioLiquido);

	}

}
