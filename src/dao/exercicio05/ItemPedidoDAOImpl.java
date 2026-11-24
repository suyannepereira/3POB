
package poo.dao.exercicio05;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class ItemPedidoDAOImpl implements ItemPedidoDAO {

    @Override
    public void salvarItens(
            Connection conn,
            long pedidoId,
            List<ItemPedido> itens
    ) throws SQLException {

        String sql = "INSERT INTO itens_pedido "
                + "(pedido_id, descricao, quantidade, valor_unitario) "
                + "VALUES (?, ?, ?, ?)";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {

            //percorrendo a lista de itens
            for (ItemPedido item : itens) {

                stmt.setLong(1, pedidoId);
                stmt.setString(2, item.getDescricao());
                stmt.setInt(3, item.getQuantidade());
                stmt.setBigDecimal(4, item.getValorUnitario());

                stmt.executeUpdate();

                item.setPedidoId(pedidoId);
            }
        }
    }
}
