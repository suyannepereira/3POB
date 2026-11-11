package excecoes.lista10.exercicio03;

public class Main {

    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente("123", 500);

        try {

            conta.sacar(200);
            conta.sacar(400);

        } catch (SaldoInsuficienteException e) {

            System.out.println("Erro: " + e.getMessage());

        }

        System.out.println("Saldo atual: R$ " + conta.getSaldo());
    }
}
