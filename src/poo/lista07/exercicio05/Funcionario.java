package poo.lista07.exercicio05;

public class Funcionario {

	private String nome;
	private String matricula;
	private double salario;

	public Funcionario(String nome, String matricula, double salario){
		this.nome = nome;
		this.matricula = matricula;
		this.salario = salario;
	}

	public String getNome(){
		return nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public String getMatricula(){
		return matricula;
	}

	public double getSalario(){
		return salario;
	}

	public void setSalario(double novoSalario){

		if(novoSalario > salario){
			salario = novoSalario;
		}else{
			System.out.println("Erro: o novo salario deve ser maior que o salario atual");
		}
	}

	public void exibirDados(){

		System.out.println("Nome: " + nome);
		System.out.println("Matricula: " + matricula);
		System.out.printf("Salario: R$ %.2f%n", salario);
	}
}