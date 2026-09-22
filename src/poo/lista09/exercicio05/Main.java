package poo.lista09.exercicio05;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static double calcularTotalImpostos(List<Tributavel> itensTributaveis){

        double total = 0;

        for(Tributavel item : itensTributaveis){
            total = total + item.calcularTributo();
        }

        return total;
    }

    public static void main(String[] args) {

        Eletronico computador = new Eletronico(1, 2000);

        Eletronico celular = new Eletronico(2, 1000);

        List<Tributavel> itensTributaveis = new ArrayList<>();

        itensTributaveis.add(computador);
        itensTributaveis.add(celular);

        double total = calcularTotalImpostos(itensTributaveis);

        System.out.println("Total de impostos: R$ " + total);
    }
}