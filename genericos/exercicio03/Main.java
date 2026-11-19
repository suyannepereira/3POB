package poo.genericos.exercicio03;

public class Main {

	 public static void main(String[] args) {

	        // Calculadora que trabalha com Integer
	        CalculadoraEstatistica<Integer> calcInteiros =
	                new CalculadoraEstatistica<>();

	        calcInteiros.adicionar(10);
	        calcInteiros.adicionar(20);
	        calcInteiros.adicionar(30);

	        System.out.println("Números inteiros:");
	        System.out.println("Média: " + calcInteiros.calcularMedia());
	        System.out.println("Maior: " + calcInteiros.calcularMaior());


	        // Calculadora que trabalha com Double
	        CalculadoraEstatistica<Double> calcDecimais =
	                new CalculadoraEstatistica<>();

	        calcDecimais.adicionar(5.5);
	        calcDecimais.adicionar(8.5);
	        calcDecimais.adicionar(10.0);

	        System.out.println("\nNúmeros decimais:");
	        System.out.println("Média: " + calcDecimais.calcularMedia());
	        System.out.println("Maior: " + calcDecimais.calcularMaior());

	    }
}
