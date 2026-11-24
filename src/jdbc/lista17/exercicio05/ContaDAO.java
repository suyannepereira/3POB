package jdbc.lista17.exercicio05;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ContaDAO {

    public void transferirFundos(Connection conn, Long idOrigem,
            Long idDestino, double valor) throws SQLException {

        boolean autoCommitOriginal = conn.getAutoCommit();

        try {

            conn.setAutoCommit(false);

            // Débito na conta de origem
            String sqlDebito = "UPDATE contas SET saldo = saldo - ? WHERE id = ? AND saldo >= ?";

            PreparedStatement pstmtDebito = conn.prepareStatement(sqlDebito);

            pstmtDebito.setDouble(1, valor);
            pstmtDebito.setLong(2, idOrigem);
            pstmtDebito.setDouble(3, valor);

            int resultadoDebito = pstmtDebito.executeUpdate();

            pstmtDebito.close();

            if (resultadoDebito == 0) {
                throw new SQLException("Saldo insuficiente ou conta de origem nao encontrada");
            }

            // Crédito na conta de destino
            String sqlCredito = "UPDATE contas SET saldo = saldo + ? WHERE id = ?";

            PreparedStatement pstmtCredito = conn.prepareStatement(sqlCredito);

            pstmtCredito.setDouble(1, valor);
            pstmtCredito.setLong(2, idDestino);

            int resultadoCredito = pstmtCredito.executeUpdate();

            pstmtCredito.close();

            if (resultadoCredito == 0) {
                throw new SQLException("Conta de destino nao encontrada");
            }

            // Confirma as duas operações
            conn.commit();

            System.out.println("Transferencia realizada com sucesso");

        } catch (SQLException e) {

            // Desfaz as operações caso aconteça algum erro
            conn.rollback();

            System.out.println("Erro na transferencia: " + e.getMessage());

            throw e;

        } finally {

            // Restaura o autocommit original
            conn.setAutoCommit(autoCommitOriginal);
        }
    }
}