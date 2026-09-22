package poo.lista08.exercicio05;

public class Conta {

	private String numero;
	protected double saldo;

	public Conta(String numero){
		this.numero = numero;
		this.saldo = 0;
	}

	public String getNumero(){
		return numero;
	}

	public double getSaldo(){
		return saldo;
	}

	public void depositar(double valor){

		if(valor > 0){
			saldo += valor;
		}else{
			System.out.println("Valor de deposito invalido");
		}
	}

	public void sacar(double valor){

		if(valor > 0 && valor <= saldo){
			saldo -= valor;
		}else{
			System.out.println("Saque nao permitido");
		}
	}
}