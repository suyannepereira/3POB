package poo.exercicio05;

public class Aluno {
	
	String nome;
	String matricula;
	double nota1;
	double nota2;
	
	public double calcularMedia(){
		
		double media = (nota1 + nota2) / 2;
		
		return media;
	}
	
	public String verificarAprovacao(){
		
		if(this.calcularMedia() > 7){
			return "Aprovado";
		}else{
			return "Reprovado";
		}
	}
	
	public void imprimirBoletim(){
		
		System.out.println("Nome: " + nome);
		System.out.println("Matricula: " + matricula);
		System.out.println("Media: " + this.calcularMedia());
		System.out.println("Situacao: " + this.verificarAprovacao());
	}
}
