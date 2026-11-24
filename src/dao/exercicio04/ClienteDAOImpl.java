
package poo.dao.exercicio04;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Optional;

public class ClienteDAOImpl implements ClienteDAO {

    private Connection conexao;

    //construtor
    public ClienteDAOImpl(Connection conexao) {
        this.conexao = conexao;
    }

    //busca o cliente pelo CPF
    @Override
    public Optional<Cliente> buscarPorCpf(String cpf)
            throws SQLException {

        String sql = "SELECT * FROM clientes WHERE cpf = ?";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setString(1, cpf);

            try (ResultSet resultado = stmt.executeQuery()) {

                if (resultado.next()) {

                    Cliente cliente = new Cliente(
                            resultado.getString("nome"),
                            resultado.getString("email"),
                            resultado.getString("cpf")
                    );

                    cliente.setId(resultado.getLong("id"));

                    return Optional.of(cliente);
                }
            }
        }

        return Optional.empty();
    }

    //salva o cliente
    @Override
    public void salvar(Cliente cliente) throws SQLException {

        String sql = "INSERT INTO clientes (nome, email, cpf) " + "VALUES (?, ?, ?)";

        try (PreparedStatement stmt = conexao.prepareStatement(
                sql, Statement.RETURN_GENERATED_KEYS)) {

            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getEmail());
            stmt.setString(3, cliente.getCpf());

            stmt.executeUpdate();

            //recuperando o is gerado pelo MYSQL
            try (ResultSet resultado = stmt.getGeneratedKeys()) {
                if (resultado.next()) {
                    cliente.setId(resultado.getLong(1));
                }
            }
        }
    }
}
