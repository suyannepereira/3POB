
package br.edu.universidade.sistema.catalogo;

import java.util.Objects;

public class Produto implements Comparable<Produto> {

    private String codigo;
    private String descricao;
    private double preco;
    private int quantidade;

    //construtor
    public Produto(String codigo, String descricao, double preco, int quantidade) {

        if(codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("Codigo invalido");
        }

        if(descricao == null || descricao.trim().isEmpty()) {
            throw new IllegalArgumentException("Descricao invalida");
        }

        if(preco < 0) {
            throw new IllegalArgumentException("O preco nao pode ser negativo");
        }

        if(quantidade < 0) {
            throw new IllegalArgumentException("A quantidade nao pode ser negativa");
        }

        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //getters
    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    // Ordenação pelo preço
    @Override
    public int compareTo(Produto outro) {
        return Double.compare(this.preco, outro.preco);
    }

    // Verifica se dois produtos possuem o mesmo código
    @Override
    public boolean equals(Object obj) {

        if(this == obj) {
            return true;
        }

        if(obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Produto outro = (Produto) obj;

        return Objects.equals(codigo, outro.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public String toString() {
        return String.format("Codigo: %s | Descricao: %s | Preco: R$ %.2f | Quantidade: %d", codigo, descricao, preco, quantidade);
    }
}
