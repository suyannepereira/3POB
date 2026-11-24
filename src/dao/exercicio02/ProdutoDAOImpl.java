
package poo.dao.exercicio02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProdutoDAOImpl implements GenericDAO<Produto, Long> {

    private Connection conexao;

    //construtor
    public ProdutoDAOImpl(Connection conexao) {
        this.conexao = conexao;
    }

    //CREATE: Salva o produto
    @Override
    public void salvar(Produto produto) throws SQLException {

        String sql = "INSERT INTO produtos "
                + "(descricao, preco_unitario, quantidade_estoque) "
                + "VALUES (?, ?, ?)";

        try (PreparedStatement stmt = conexao.prepareStatement(
                sql, Statement.RETURN_GENERATED_KEYS)) {

            stmt.setString(1, produto.getDescricao());
            stmt.setBigDecimal(2, produto.getPrecoUnitario());
            stmt.setInt(3, produto.getQuantidadeEstoque());

            stmt.executeUpdate();

            //recupera o id gerado pelo banco
            try (ResultSet resultado = stmt.getGeneratedKeys()) {

                if (resultado.next()) {
                    produto.setId(resultado.getLong(1));
                }
            }
        }
    }

    //rEAD: Busca o produto pelo id
    @Override
    public Optional<Produto> buscarPorId(Long id) throws SQLException {

        String sql = "SELECT * FROM produtos WHERE id = ?";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setLong(1, id);

            try (ResultSet resultado = stmt.executeQuery()) {

                if (resultado.next()) {

                    Produto produto = new Produto(
                            resultado.getString("descricao"),
                            resultado.getBigDecimal("preco_unitario"),
                            resultado.getInt("quantidade_estoque")
                    );

                    produto.setId(resultado.getLong("id"));

                    return Optional.of(produto);
                }
            }
        }

        return Optional.empty();
    }

    //READ: Lista todos os produtos
    @Override
    public List<Produto> listarTodos() throws SQLException {

        List<Produto> produtos = new ArrayList<>();

        String sql = "SELECT * FROM produtos ORDER BY id";

        try (PreparedStatement stmt = conexao.prepareStatement(sql);
             ResultSet resultado = stmt.executeQuery()) {

            while (resultado.next()) {

                Produto produto = new Produto(
                        resultado.getString("descricao"),
                        resultado.getBigDecimal("preco_unitario"),
                        resultado.getInt("quantidade_estoque")
                );

                produto.setId(resultado.getLong("id"));

                produtos.add(produto);
            }
        }

        return produtos;
    }

    //UPDATE: Atualizar produto
    @Override
    public void atualizar(Produto produto) throws SQLException {

        String sql = "UPDATE produtos SET "
                + "descricao = ?, "
                + "preco_unitario = ?, "
                + "quantidade_estoque = ? "
                + "WHERE id = ?";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setString(1, produto.getDescricao());
            stmt.setBigDecimal(2, produto.getPrecoUnitario());
            stmt.setInt(3, produto.getQuantidadeEstoque());
            stmt.setLong(4, produto.getId());

            stmt.executeUpdate();
        }
    }

    //DELETE: Excluir produto pelo id
    @Override
    public void deletarPorId(Long id) throws SQLException {

        String sql = "DELETE FROM produtos WHERE id = ?";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setLong(1, id);

            stmt.executeUpdate();
        }
    }
}
