package colecoes.lista11.exercicio05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //criando uma lista de produtos
        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Notebook", "Informatica", 3500));
        produtos.add(new Produto("Mouse", "Informatica", 80));
        produtos.add(new Produto("Arroz", "Alimentos", 25));
        produtos.add(new Produto("Feijao", "Alimentos", 10));
        produtos.add(new Produto("Java basico", "Livros", 60));
        produtos.add(new Produto("POO", "Livros", 75));

        //criando o HashMap
        HashMap<String, List<Produto>> categorias = new HashMap<>();

        //agrupando os produtos
        for(Produto produto : produtos){
            String categoria = produto.getCategoria();
            if(!categorias.containsKey(categoria)){
                categorias.put(categoria, new ArrayList<>());
            }

            categorias.get(categoria).add(produto);
        }

        //exibindo os produtos agrupados
        for(String categoria : categorias.keySet()){
            System.out.println("\nCategoria: " + categoria);
            for (Produto produto : categorias.get(categoria)) {
                System.out.println(produto.getNome() + " - R$ " + produto.getPreco());
            }
        }
    }
}