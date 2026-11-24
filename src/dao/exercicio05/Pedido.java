
package poo.dao.exercicio05;

import java.math.BigDecimal;

public class Pedido {

    private Long id;
    private String nomeCliente;
    private BigDecimal valorTotal;

    
    public Pedido(String nomeCliente, BigDecimal valorTotal) {
        this.nomeCliente = nomeCliente;
        this.valorTotal = valorTotal;
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "Pedido ID: " + id + " | Cliente: " + nomeCliente + " | Valor total: R$ " + valorTotal;
    }
}
