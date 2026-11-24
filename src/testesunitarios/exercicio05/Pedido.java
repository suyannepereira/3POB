
package poo.testesunitarios.exercicio05;

public class Pedido {

    private Long id;
    private double valor;
    private String status;

    // Construtor
    public Pedido(Long id, double valor, String status) {
        this.id = id;
        this.valor = valor;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
