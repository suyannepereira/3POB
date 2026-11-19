
package poo.genericos.exercicio04;

public class Quadrado extends Figura {

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
