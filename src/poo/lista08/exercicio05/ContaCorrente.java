package poo.lista08.exercicio05;

public class ContaCorrente extends Conta {

	private double limiteChequeEspecial;

	public ContaCorrente(String numero, double limiteChequeEspecial){
		super(numero);
		this.limiteChequeEspecial = limiteChequeEspecial;
	}

	@Override
	public void sacar(double valor) {

		double taxa = 2.00;
		double valorTotal = valor + taxa;

		if(valor > 0 && valorTotal <= saldo + limiteChequeEspecial){
			saldo -= valorTotal;
		}else{
			System.out.println("Saque nao permitido");
		}
	}
}