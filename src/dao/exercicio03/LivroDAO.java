
package poo.dao.exercicio03;

import java.sql.SQLException;
import java.util.List;

public interface LivroDAO {

    List<Livro> buscarPaginado(
            int pagina,
            int tamanhoPagina
    ) throws SQLException;

}
