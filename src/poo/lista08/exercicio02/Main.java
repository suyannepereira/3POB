package poo.lista08.exercicio02;

public class Main {

	public static void main(String[] args) {

		Funcionario[] funcionarios = new Funcionario[3];

		funcionarios[0] = new Funcionario("Joao", 2000);
		funcionarios[1] = new Gerente("Maria", 3000, 1000);
		funcionarios[2] = new Vendedor("Carlos", 2000, 10000, 5);

		double totalFolha = 0;
		int i;
		
		for(i = 0; i < funcionarios.length; i++){
			double salario = funcionarios[i].calcularSalario();
			System.out.println(funcionarios[i].nome + ": R$ " + salario);
			totalFolha += salario;
		}

		System.out.println();
		System.out.println("Total da folha: R$ " + totalFolha);
	}
}