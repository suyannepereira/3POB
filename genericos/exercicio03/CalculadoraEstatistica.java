
package poo.genericos.exercicio03;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraEstatistica<T extends Number> {

    private List<T> numeros;

    public CalculadoraEstatistica() {
        numeros = new ArrayList<>();
    }

    // Adiciona um número à lista
    public void adicionar(T numero) {
        numeros.add(numero);
    }

    // Calcula a média dos números
    public double calcularMedia() {

        if (numeros.isEmpty()) {
            return 0.0;
        }

        double soma = 0;

        for (T numero : numeros) {
            soma += numero.doubleValue();
        }

        return soma / numeros.size();
    }

    // Encontra o maior número
    public double calcularMaior() {

        if (numeros.isEmpty()) {
            throw new IllegalStateException(
                "Não existem números na lista."
            );
        }

        double maior = numeros.get(0).doubleValue();

        for (T numero : numeros) {

            if (numero.doubleValue() > maior) {
                maior = numero.doubleValue();
            }
        }

        return maior;
    }
}
