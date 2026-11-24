package jdbc.lista17.exercicio02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {

    public List<Produto> buscarPorFaixaPreco(Connection conn, double min, double max)
            throws SQLException {

        List<Produto> produtos = new ArrayList<>();

        String sql = "SELECT id, nome, preco, estoque FROM produtos WHERE preco BETWEEN ? AND ?";

        PreparedStatement pstmt = conn.prepareStatement(sql);

        pstmt.setDouble(1, min);
        pstmt.setDouble(2, max);

        ResultSet rs = pstmt.executeQuery();

        while (rs.next()) {

            Long id = rs.getLong("id");
            String nome = rs.getString("nome");
            Double preco = rs.getDouble("preco");
            Integer estoque = rs.getInt("estoque");

            Produto produto = new Produto(id, nome, preco, estoque);

            produtos.add(produto);
        }

        rs.close();
        pstmt.close();

        return produtos;
    }
}