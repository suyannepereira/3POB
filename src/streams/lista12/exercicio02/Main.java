package streams.lista12.exercicio02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalDouble;

public class Main {

    public static void main(String[] args) {

        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Notebook", 3500));
        produtos.add(new Produto("Mouse", 80));
        produtos.add(new Produto("Teclado", 150));
        produtos.add(new Produto("Monitor", 1200));
        produtos.add(new Produto("Fone", 200));
        produtos.add(new Produto("Impressora", 900));

        //somando os preços
        double total = produtos.stream()
                .mapToDouble(produto -> produto.getPreco())
                .sum();

        System.out.println("Valor total: R$ " + total);

        //calculando a média
        OptionalDouble media = produtos.stream()
                .mapToDouble(produto -> produto.getPreco())
                .average();

        System.out.println("Preco medio: R$ " + media.getAsDouble());

        //encontrando o produto mais caro
        Optional<Produto> maiorPreco = produtos.stream()
                .max(Comparator.comparingDouble(produto -> produto.getPreco()));

        System.out.println("\nProduto mais caro:");

        if(maiorPreco.isPresent()){
            System.out.println(maiorPreco.get().getNome());
            System.out.println("Preço: R$ " + maiorPreco.get().getPreco());
        }
    }
}