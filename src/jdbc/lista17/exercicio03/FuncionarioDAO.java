package jdbc.lista17.exercicio03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FuncionarioDAO {

    public void atualizarSalario(Connection conn, Long id, double novoSalario)
            throws SQLException {

        String sql = "UPDATE funcionarios SET salario = ? WHERE id = ?";

        PreparedStatement pstmt = conn.prepareStatement(sql);

        pstmt.setDouble(1, novoSalario);
        pstmt.setLong(2, id);

        int linhasAfetadas = pstmt.executeUpdate();

        if (linhasAfetadas == 0) {
            System.out.println("Nenhum registro encontrado com o id informado");
        } else {
            System.out.println("Salario atualizado com sucesso");
        }

        pstmt.close();
    }

    public void deletarPorId(Connection conn, Long id) throws SQLException {

        String sql = "DELETE FROM funcionarios WHERE id = ?";

        PreparedStatement pstmt = conn.prepareStatement(sql);

        pstmt.setLong(1, id);

        int linhasAfetadas = pstmt.executeUpdate();

        if (linhasAfetadas == 0) {
            System.out.println("Nenhum registro encontrado com o id informado");
        } else {
            System.out.println("O funcionario foi excluido com sucesso");
        }

        pstmt.close();
    }
}