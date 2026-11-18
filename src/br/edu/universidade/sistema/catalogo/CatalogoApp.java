
package br.edu.universidade.sistema.catalogo;

import java.util.List;

public class CatalogoApp {

    public static void main(String[] args) {

        CatalogoService catalogo = new CatalogoService();

        catalogo.cadastrar(new Produto("P001", "Notebook", 3500.00, 5));

        catalogo.cadastrar(new Produto("P002", "Mouse", 80.00, 20));

        catalogo.cadastrar(new Produto("P003", "Teclado", 150.00, 12));

        catalogo.cadastrar(new Produto("P004", "Monitor", 950.00, 8));


        //exibindo catálogo inicial
        System.out.println("===== CATALOGO INICIAL =====");

        exibirProdutos(catalogo.listarTodos());


        //excluindo um produto
        System.out.println("\n===== EXCLUSAO =====");

        boolean excluiu = catalogo.excluirPorCodigo("P003");

        System.out.println("O produto foi excluido? " + excluiu);


        //exibindo catálogo após a exclusão
        System.out.println("\n===== APOS A EXCLUSAO =====");

        exibirProdutos(catalogo.listarTodos());


        catalogo.ordenarPorPreco();

        System.out.println("\n===== CATALOGO ORDENADO =====");

        exibirProdutos(catalogo.listarTodos());


        System.out.println("\n===== BUSCA POR UMA POSICAO =====");

        System.out.println(catalogo.obterPorPosicao(0));

    }


    public static void exibirProdutos(List<Produto> produtos) {
        for(int i = 0; i < produtos.size(); i++) {
            System.out.println("indice " + i + ": " + produtos.get(i));

        }

    }

}
