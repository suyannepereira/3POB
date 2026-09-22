package poo.lista08.exercicio05;

public class ContaPoupanca extends Conta {

	private double taxaRendimento;

	public ContaPoupanca(String numero, double taxaRendimento){
		super(numero);
		this.taxaRendimento = taxaRendimento;
	}

	public void aplicarRendimento(){

		saldo += saldo * taxaRendimento / 100;
	}
}