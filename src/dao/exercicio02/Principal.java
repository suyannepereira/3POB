
package poo.dao.exercicio02;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class Principal {

    public static void main(String[] args) {

        try (Connection conexao = ConnectionFactory.getConnection()) {

            //criando o DAO
            GenericDAO<Produto, Long> produtoDAO =
                    new ProdutoDAOImpl(conexao);


            // =================================
            // 1. CREATE - CADASTRAR PRODUTOS
            // =================================

            Produto produto1 = new Produto(
                    "Notebook",
                    new BigDecimal("3500.00"),
                    10
            );

            Produto produto2 = new Produto(
                    "Mouse",
                    new BigDecimal("80.00"),
                    25
            );

            Produto produto3 = new Produto(
                    "Teclado",
                    new BigDecimal("150.00"),
                    15
            );

            produtoDAO.salvar(produto1);
            produtoDAO.salvar(produto2);
            produtoDAO.salvar(produto3);

            System.out.println("=== PRODUTOS CADASTRADOS ===");

            System.out.println(produto1);
            System.out.println(produto2);
            System.out.println(produto3);


            // =================================
            // 2. READ - BUSCAR POR ID
            // =================================

            System.out.println("\n=== BUSCAR PRODUTO POR ID ===");

            Optional<Produto> resultado =
                    produtoDAO.buscarPorId(produto1.getId());

            if (resultado.isPresent()) {

                System.out.println(resultado.get());

            } else {

                System.out.println("Produto nao encontrado");
            }


            // =================================
            // 3. READ - LISTAR TODOS
            // =================================

            System.out.println("\n=== TODOS OS PRODUTOS ===");

            List<Produto> produtos = produtoDAO.listarTodos();

            for (Produto produto : produtos) {
                System.out.println(produto);
            }


            // =================================
            // 4. UPDATE - ATUALIZAR PRODUTO
            // =================================

            System.out.println("\n=== ATUALIZANDO PRODUTO ===");

            produto1.setPrecoUnitario(new BigDecimal("3200.00"));
            produto1.setQuantidadeEstoque(8);

            produtoDAO.atualizar(produto1);

            System.out.println("Produto atualizado");


            // =================================
            // 5. DELETE - EXCLUIR PRODUTO
            // =================================

            System.out.println("\n=== EXCLUINDO PRODUTO ===");

            produtoDAO.deletarPorId(produto2.getId());

            System.out.println("Produto excluido");


            // =================================
            // LISTAGEM FINAL
            // =================================

            System.out.println("\n=== LISTAGEM FINAL ===");

            List<Produto> listaFinal = produtoDAO.listarTodos();

            for (Produto produto : listaFinal) {
                System.out.println(produto);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao acessar o banco de dados");
            e.printStackTrace();
        }
    }
}
