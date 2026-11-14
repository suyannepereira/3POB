package colecoes.lista11.exercicio04;

import java.util.HashMap;

public class Estoque {

    private HashMap<String, Integer> produtos = new HashMap<>();

    public void inserirProduto(String codigo, int quantidade) {
        produtos.put(codigo, quantidade);
        System.out.println("O produto cadastrado");
    }

   
    public void atualizarEstoque(String codigo, int quantidade) {
        if(produtos.containsKey(codigo)){
            int atual = produtos.get(codigo);
            produtos.put(codigo, atual + quantidade);
            System.out.println("O estoque foi atualizado");
        }else {
            System.out.println("O produto roduto nao foi encontrado");
        }
    }

    //para exibir produtos com o estoque baixo
    public void verificarEstoque() {
        System.out.println("\nProdutos com estoque baixo:");
        for(String codigo : produtos.keySet()){
            int quantidade = produtos.get(codigo);
            if(quantidade < 5){
                System.out.println("Codigo: " + codigo);
                System.out.println("Quantidade: " + quantidade);
            }
        }
    }


    public void exibirProdutos() {

        System.out.println("\nLista de produtos:");
        for(String codigo : produtos.keySet()){
            System.out.println("Codigo: " + codigo + " | Quantidade: " + produtos.get(codigo));
        }
    }
}