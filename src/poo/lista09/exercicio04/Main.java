package poo.lista09.exercicio04;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<ContaBancaria> contas = new ArrayList<>();

        ContaCorrente corrente = new ContaCorrente(1, 1000);

        ContaEmpresarial empresarial = new ContaEmpresarial(2, 2000);

        contas.add(corrente);
        contas.add(empresarial);

        for(ContaBancaria conta : contas){
            conta.cobrarTaxaMensal();
            System.out.println("Saldo apos a taxa: R$ "+ conta.consultarSaldo());
        }
    }
}