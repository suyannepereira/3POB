
package poo.dao.exercicio05;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class VendaService {

    private PedidoDAO pedidoDAO;
    private ItemPedidoDAO itemPedidoDAO;

    //construtor com injeção de dependência
    public VendaService(
            PedidoDAO pedidoDAO,
            ItemPedidoDAO itemPedidoDAO) {

        this.pedidoDAO = pedidoDAO;
        this.itemPedidoDAO = itemPedidoDAO;
    }

    //registrar venda
    public void registrarVenda(
            Pedido pedido,
            List<ItemPedido> itens
    ) throws SQLException {

        if (itens == null || itens.isEmpty()) {
            throw new IllegalArgumentException("A venda precisa possuir pelo menos um item");
        }

        //brindo uma única conexão
        try (Connection conexao =
                ConnectionFactory.getConnection()) {

            try {

                // Desativando o autocommit
                conexao.setAutoCommit(false);

                // 1. Criando o pedido
                long pedidoId = pedidoDAO.criarPedido(
                        conexao,
                        pedido
                );

                // 2. Salvando os itens do pedido
                itemPedidoDAO.salvarItens(
                        conexao,
                        pedidoId,
                        itens
                );

                // 3. Confirmando a transação
                conexao.commit();

                System.out.println("A venda foiregistrada com sucesso");

            } catch (SQLException | RuntimeException e) {

                //se alguma operação falhar, desfaz tudo
                try {

                    conexao.rollback();

                } catch (SQLException erroRollback) {
                    e.addSuppressed(erroRollback);
                }

                throw e;
            }
        }
    }
}
