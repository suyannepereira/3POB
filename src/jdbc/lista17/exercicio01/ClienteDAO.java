package jdbc.lista17.exercicio01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ClienteDAO {

    public void inserirCliente(Connection conn, String nome, String email) throws SQLException {

        String sql = "INSERT INTO clientes (nome, email) VALUES (?, ?)";

        PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

        pstmt.setString(1, nome);
        pstmt.setString(2, email);

        pstmt.executeUpdate();

        ResultSet rs = pstmt.getGeneratedKeys();

        if (rs.next()) {
            long id = rs.getLong(1);
            System.out.println("Cliente cadastrado com sucesso!");
            System.out.println("ID gerado: " + id);
        }

        rs.close();
        pstmt.close();
    }
}