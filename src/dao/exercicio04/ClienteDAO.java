
package poo.dao.exercicio04;

import java.sql.SQLException;
import java.util.Optional;

public interface ClienteDAO {

    Optional<Cliente> buscarPorCpf(String cpf)
            throws SQLException;

    void salvar(Cliente cliente)
            throws SQLException;

}
