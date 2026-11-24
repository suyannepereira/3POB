
package poo.dao.exercicio01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAOImpl implements AlunoDAO {

    private Connection conexao;

    //recebe a conexão pelo construtor
    public AlunoDAOImpl(Connection conexao) {
        this.conexao = conexao;
    }

    //insere um aluno no banco
    @Override
    public void inserir(Aluno aluno) throws SQLException {

        String sql = "INSERT INTO alunos (nome, matricula) VALUES (?, ?)";

        try (PreparedStatement stmt = conexao.prepareStatement(
                sql, Statement.RETURN_GENERATED_KEYS)) {

            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getMatricula());

            stmt.executeUpdate();

            //recupera o ID gerado pelo MySQL
            try (ResultSet resultado = stmt.getGeneratedKeys()) {

                if (resultado.next()) {
                    aluno.setId(resultado.getInt(1));
                }
            }
        }
    }

    //lista todos os alunos cadastrados
    @Override
    public List<Aluno> listarTodos() throws SQLException {

        List<Aluno> alunos = new ArrayList<>();

        String sql = "SELECT id, nome, matricula FROM alunos ORDER BY id";

        try (PreparedStatement stmt = conexao.prepareStatement(sql);
             ResultSet resultado = stmt.executeQuery()) {

            while (resultado.next()) {

                Aluno aluno = new Aluno(
                        resultado.getString("nome"),
                        resultado.getString("matricula")
                );

                aluno.setId(resultado.getInt("id"));

                alunos.add(aluno);
            }
        }

        return alunos;
    }
}
