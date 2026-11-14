package streams.lista12.exercicio03;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        ArrayList<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno("Camila", "ADS", 8.5));
        alunos.add(new Aluno("Carlos", "ADS", 6.0));
        alunos.add(new Aluno("Beatriz", "Direito", 9.0));
        alunos.add(new Aluno("Pedro", "Direito", 5.5));
        alunos.add(new Aluno("Mariana", "Engenharia", 7.5));
        alunos.add(new Aluno("Jose", "Engenharia", 6.5));

        //agrupando alunos por curso
        Map<String, List<Aluno>> cursos = alunos.stream()
                .collect(Collectors.groupingBy(aluno -> aluno.getCurso()));

        System.out.println("Alunos por curso:");

        for(String curso : cursos.keySet()){
            System.out.println("\nCurso: " + curso);
            for (Aluno aluno : cursos.get(curso)) {
                System.out.println(aluno.getNome());
            }
        }

        //separando aprovados e reprovados
        Map<Boolean, List<Aluno>> resultado = alunos.stream()
                .collect(Collectors.partitioningBy(aluno -> aluno.getNotaFinal() > 7.0));

        System.out.println("\nAlunos aprovados:");

        for(Aluno aluno : resultado.get(true)){
            System.out.println(aluno.getNome() + " - " + aluno.getNotaFinal());
        }

        System.out.println("\nAlunos reprovados:");

        for(Aluno aluno : resultado.get(false)){
            System.out.println(aluno.getNome() + " - " + aluno.getNotaFinal());
        }
    }
}