
package poo.dao.exercicio05;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        // =================================
        // 1. CRIANDO OS DAOS
        // =================================

        PedidoDAO pedidoDAO = new PedidoDAOImpl();

        ItemPedidoDAO itemPedidoDAO = new ItemPedidoDAOImpl();


        // =================================
        // 2. INJETANDO AS DEPENDÊNCIAS
        // =================================

        VendaService vendaService = new VendaService(
                pedidoDAO,
                itemPedidoDAO
        );


        // =================================
        // 3. CRIANDO O PEDIDO
        // =================================

        Pedido pedido = new Pedido(
                "Ana Silva",
                new BigDecimal("250.00")
        );


        // =================================
        // 4. CRIANDO OS ITENS DA VENDA
        // =================================

        List<ItemPedido> itens = new ArrayList<>();

        ItemPedido item1 = new ItemPedido(
                "Teclado",
                2,
                new BigDecimal("100.00")
        );

        ItemPedido item2 = new ItemPedido(
                "Mouse",
                1,
                new BigDecimal("50.00")
        );

        itens.add(item1);
        itens.add(item2);


        // =================================
        // 5. REGISTRANDO A VENDA
        // =================================

        try {

            vendaService.registrarVenda(pedido, itens);

            System.out.println("\n=== PEDIDO REGISTRADO ===");

            System.out.println(pedido);

            System.out.println("\n=== ITENS DA VENDA ===");

            for (ItemPedido item : itens) {
                System.out.println(item);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao registrar a venda: " + e.getMessage());

        } catch (IllegalArgumentException e) {
            System.out.println("Dados invalidos: " + e.getMessage());
        }
    }
}
