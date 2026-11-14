package colecoes.lista11.exercicio01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> tarefas = new ArrayList<>();

        //adicionando 5 tarefas
        for(int i = 0; i < 5; i++){
            System.out.print("Digite uma tarefa: ");
            String tarefa = sc.nextLine();

            tarefas.add(tarefa);
        }

        System.out.println("\nLista de tarefas:");
        System.out.println(tarefas);

        //removendo uma tarefa
        System.out.print("\nDigite o nome da tarefa que deseja remover: ");
        String remover = sc.nextLine();

        if(tarefas.remove(remover)){
            System.out.println("A tarefa foi removida");
        }else {
            System.out.println("A tarefa nao foi encontrada");
        }

        //verificando se uma tarefa existe
        System.out.print("\nDigite uma tarefa para pesquisar: ");
        String pesquisar = sc.nextLine();

        if(tarefas.contains(pesquisar)){
            System.out.println("A tarefa existe na lista");
        }else {
            System.out.println("A tarefa nao existe na lista");
        }

        //ordenando a lista
        Collections.sort(tarefas);

        System.out.println("\nLista ordenada:");
        System.out.println(tarefas);

        sc.close();
    }
}