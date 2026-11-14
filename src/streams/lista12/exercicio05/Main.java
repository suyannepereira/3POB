package streams.lista12.exercicio05;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Funcionario("Clara", "TI", 3000));
        funcionarios.add(new Funcionario("Miguel", "RH", 2500));
        funcionarios.add(new Funcionario("Fernanda", "TI", 4000));
        funcionarios.add(new Funcionario("Victor", "Financeiro", 3500));
        funcionarios.add(new Funcionario("Thalia", "TI", 5000));

        //verificar se o funcionário é do departamento de TI
        Predicate<Funcionario> departamentoTI = funcionario -> funcionario.getDepartamento().equals("TI");

        //calcular aumento de 10%
        Function<Funcionario, Double> reajuste = funcionario -> funcionario.getSalario() * 1.10;

        //exibir o salário com reajuste
        Consumer<Double> exibirSalario = salario -> System.out.printf("Salario projetado: R$ %.2f%n", salario);

        //processando os funcionários
        funcionarios.stream()
                .filter(departamentoTI)
                .map(reajuste)
                .forEach(exibirSalario);
    }
}