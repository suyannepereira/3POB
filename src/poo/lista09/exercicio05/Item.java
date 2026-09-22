package poo.lista09.exercicio05;

public abstract class Item {

    protected int codigo;
    protected double precoBase;

    public Item(int codigo, double precoBase){
        this.codigo = codigo;
        this.precoBase = precoBase;
    }
}