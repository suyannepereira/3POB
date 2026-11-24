
package poo.dao.exercicio03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LivroDAOImpl implements LivroDAO {

    private Connection conexao;

    //construtor
    public LivroDAOImpl(Connection conexao) {
        this.conexao = conexao;
    }

    //busca os livros utilizando paginação
    @Override
    public List<Livro> buscarPaginado(
            int pagina,
            int tamanhoPagina
    ) throws SQLException {

        //validação dos parâmetros
        if (pagina < 1 || tamanhoPagina < 1) {
            throw new IllegalArgumentException("A pagina e o tamanho devem ser maiores que zero");
        }

        //calculando o OFFSET
        long offset = (long) (pagina - 1) * tamanhoPagina;

        //criando a lista que armazenará os livros
        List<Livro> livros = new ArrayList<>();

        //comando SQL com LIMIT e OFFSET
        String sql = "SELECT * FROM livros "  + "ORDER BY id LIMIT ? OFFSET ?";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {

            //primeiro parâmetro: quantidade de livros
            stmt.setInt(1, tamanhoPagina);

            //segundo parâmetro: quantidade de registros a pular
            stmt.setLong(2, offset);

            //executando a consulta
            try (ResultSet resultado = stmt.executeQuery()) {

                while (resultado.next()) {

                    Livro livro = new Livro(
                            resultado.getString("titulo"),
                            resultado.getString("autor")
                    );

                    livro.setId(resultado.getLong("id"));

                    livros.add(livro);
                }
            }
        }

        return livros;
    }
}
