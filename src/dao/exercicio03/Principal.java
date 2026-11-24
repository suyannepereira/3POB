
package poo.dao.exercicio03;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        try (Connection conexao = ConnectionFactory.getConnection()) {

            //criando o DAO
            LivroDAO livroDAO = new LivroDAOImpl(conexao);

            //definindo o tamanho da página
            int tamanhoPagina = 3;

            // =================================
            // PÁGINA 1
            // =================================

            System.out.println("===== PAGINA 1 =====");

            List<Livro> livros = livroDAO.buscarPaginado(
                    1, tamanhoPagina
            );

            for (Livro livro : livros) {
                System.out.println(livro);
            }


            // =================================
            // PÁGINA 2
            // =================================

            System.out.println("\n===== PAGINA 2 =====");

            livros = livroDAO.buscarPaginado(
                    2, tamanhoPagina
            );

            for (Livro livro : livros) {
                System.out.println(livro);
            }


            // =================================
            // PÁGINA 3
            // =================================

            System.out.println("\n===== PAGINA 3 =====");

            livros = livroDAO.buscarPaginado(
                    3, tamanhoPagina
            );

            for (Livro livro : livros) {
                System.out.println(livro);
            }


            // =================================
            // PÁGINA 4
            // =================================

            System.out.println("\n===== PAGINA 4 =====");

            livros = livroDAO.buscarPaginado(
                    4, tamanhoPagina
            );

            if (livros.isEmpty()) {
                System.out.println("Nenhum livro foiencontrado");

            } else {

                for (Livro livro : livros) {
                    System.out.println(livro);
                }
            }

        } catch (SQLException e) {
            System.out.println("Erro ao acessar o banco de dados");
            e.printStackTrace();

        } catch (IllegalArgumentException e) {
            System.out.println("Parametros invalidos: " + e.getMessage());
        }
    }
}
