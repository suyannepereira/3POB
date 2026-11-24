
package poo.dao.exercicio01;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        try (Connection conexao = ConnectionFactory.getConnection()) {

            //criando o DAO e passando a conexão
            AlunoDAO alunoDAO = new AlunoDAOImpl(conexao);

            //criando os alunos
            Aluno aluno1 = new Aluno("Ana", "2026001");
            Aluno aluno2 = new Aluno("Pedro", "2026002");

            //inserindo os alunos no banco
            alunoDAO.inserir(aluno1);
            alunoDAO.inserir(aluno2);

            //exibindo os IDS gerados
            System.out.println("Alunos cadastrados com sucesso");

            System.out.println("ID da Ana: " + aluno1.getId());
            System.out.println("ID do Pedro: " + aluno2.getId());

            //listando todos os alunos
            System.out.println("\n===== LISTA DE ALUNOS =====");

            List<Aluno> alunos = alunoDAO.listarTodos();

            for (Aluno aluno : alunos) {
                System.out.println(aluno);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao acessar o banco de dados");
            e.printStackTrace();
        }
    }
}
