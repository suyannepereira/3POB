
package poo.dao.exercicio05;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PedidoDAOImpl implements PedidoDAO {

    @Override
    public long criarPedido(Connection conn, Pedido pedido)
            throws SQLException {

        String sql = "INSERT INTO pedidos "
                + "(nome_cliente, valor_total) "
                + "VALUES (?, ?)";

        try (PreparedStatement stmt = conn.prepareStatement(
                sql, Statement.RETURN_GENERATED_KEYS)) {

            stmt.setString(1, pedido.getNomeCliente());
            stmt.setBigDecimal(2, pedido.getValorTotal());

            stmt.executeUpdate();

            // Recuperando o ID gerado pelo MySQL
            try (ResultSet resultado = stmt.getGeneratedKeys()) {

                if (resultado.next()) {

                    long id = resultado.getLong(1);

                    pedido.setId(id);

                    return id;
                }
            }
        }

        throw new SQLException(
                "Não foi possível recuperar o ID do pedido."
        );
    }
}
