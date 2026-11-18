
package br.edu.universidade.sistema.catalogo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CatalogoService {

    private final List<Produto> produtos = new ArrayList<>();

    public void cadastrar(Produto p) {

        if(p == null) {
            throw new IllegalArgumentException("Produto invalido");
        }

        if(produtos.contains(p)) {
            throw new IllegalStateException("O produto ja foi cadastrado");
        }

        produtos.add(p);
    }

    public Produto obterPorPosicao(int indice) {

        if(indice < 0 || indice >= produtos.size()) {
            throw new IndexOutOfBoundsException("Posicao invalida");
        }

        return produtos.get(indice);
    }

    public boolean excluirPorCodigo(String codigo) {

        for(int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getCodigo().equals(codigo)) {
                produtos.remove(i);
                return true;
            }
        }

        return false;
    }
    
    public void ordenarPorPreco() {
        Collections.sort(produtos);
    }
    
    public List<Produto> listarTodos() {
        return new ArrayList<>(produtos);
    }

}
