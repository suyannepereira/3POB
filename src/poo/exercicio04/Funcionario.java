package poo.exercicio04;

public class Funcionario {
	
	String nome;
	String cargo;
	double salarioBruto;
	
	public void aplicarAumento(double porcentagem){
		
		double aumento = salarioBruto * porcentagem / 100;
		salarioBruto = salarioBruto + aumento;
	}
	
	public double calcularSalarioLiquido(double descontoImposto){
		
		double salarioLiquido = salarioBruto - descontoImposto;
		return salarioLiquido;
	}
}



