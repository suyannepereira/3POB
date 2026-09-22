package poo.exercicio03;

public class ContaBancaria {
	
	String titular;
	String numeroConta;
	double saldo = 0;
	
	public void depositar(double valor){
		
		if(valor > 0){
			saldo = saldo + valor;
			System.out.println("Deposito realizado.");
		}else{
			System.out.println("Valor invalido.");
		}
	}
	
	public void sacar(double valor){
		
		if(valor > 0 && saldo >= valor){
			saldo = saldo - valor;
			System.out.println("Saque realizado.");
		}else{
			System.out.println("Saldo insuficiente ou valor invalido");
		}
	}
	
	public void consultarSaldo(){
		System.out.println("Saldo atual: R$ " + saldo);
	}
}