
package poo.dao.exercicio05;

import java.math.BigDecimal;

public class ItemPedido {

    private Long id;
    private Long pedidoId;
    private String descricao;
    private int quantidade;
    private BigDecimal valorUnitario;

    //construtor
    public ItemPedido(
            String descricao,
            int quantidade,
            BigDecimal valorUnitario) {

        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(Long pedidoId) {
        this.pedidoId = pedidoId;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    @Override
    public String toString() {
        return "Produto: " + descricao  + " | Quantidade: " + quantidade + " | Valor unitario: R$ " + valorUnitario;
    }
}
