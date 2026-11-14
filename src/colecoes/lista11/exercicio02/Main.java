package colecoes.lista11.exercicio02;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashSet<Integer> turmaA = new HashSet<>();
        HashSet<Integer> turmaB = new HashSet<>();

        //cadastrando alunos da Turma A
        System.out.print("Quantos alunos tem na Turma A? ");
        int quantidadeA = sc.nextInt();

        for(int i = 0; i < quantidadeA; i++){
            System.out.print("Digite o codigo do aluno: ");
            int codigo = sc.nextInt();

            turmaA.add(codigo);
        }

        //cadastrando alunos da Turma B
        System.out.print("\nQuantos alunos tem na Turma B? ");
        int quantidadeB = sc.nextInt();

        for(int i = 0; i < quantidadeB; i++){
            System.out.print("Digite o codigo do aluno: ");
            int codigo = sc.nextInt();

            turmaB.add(codigo);
        }

        //união das turmas
        HashSet<Integer> uniao = new HashSet<>(turmaA);

        uniao.addAll(turmaB);

        System.out.println("\nAlunos das duas turmas:");
        System.out.println(uniao);

        //interseção das turmas
        HashSet<Integer> intersecao = new HashSet<>(turmaA);

        intersecao.retainAll(turmaB);

        System.out.println("\nAlunos presentes nas duas turmas:");
        System.out.println(intersecao);

        sc.close();
    }
}