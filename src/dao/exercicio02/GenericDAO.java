
package poo.dao.exercicio02;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface GenericDAO<T, ID> {

    void salvar(T entidade) throws SQLException;

    Optional<T> buscarPorId(ID id) throws SQLException;

    List<T> listarTodos() throws SQLException;

    void atualizar(T entidade) throws SQLException;

    void deletarPorId(ID id) throws SQLException;

}
