package poo.exercicio03;

public class Main {

	public static void main(String[] args) {
		
		ContaBancaria conta = new ContaBancaria();
		
		conta.titular = "Suyanne";
		conta.numeroConta = "12345";
		
		conta.consultarSaldo();
		
		conta.depositar(1000);
		
		conta.consultarSaldo();
		
		conta.sacar(300);
		
		conta.consultarSaldo();
		
		conta.sacar(1000);
		
		conta.depositar(-50);
		
		conta.consultarSaldo();
	}
}

		

