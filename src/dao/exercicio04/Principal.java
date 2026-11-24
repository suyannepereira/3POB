
package poo.dao.exercicio04;

import java.sql.Connection;
import java.sql.SQLException;

public class Principal {

    public static void main(String[] args) {

        try (Connection conexao = ConnectionFactory.getConnection()) {

            //criando a implementação concreta do DAO
            ClienteDAO clienteDAO = new ClienteDAOImpl(conexao);

            // Injetando o DAO no Service
            ClienteService clienteService =
                    new ClienteService(clienteDAO);


            // =================================
            // 1. CADASTRAR PRIMEIRO CLIENTE
            // =================================

            Cliente cliente1 = new Cliente(
                    "Ana Silva",
                    "ana@email.com",
                    "11122233344"
            );

            clienteService.cadastrarCliente(cliente1);

            System.out.println(cliente1);


            // =================================
            // 2. TENTAR CADASTRAR CPF DUPLICADO
            // =================================

            Cliente cliente2 = new Cliente(
                    "Maria Souza",
                    "maria@email.com",
                    "11122233344"
            );

            try {

                clienteService.cadastrarCliente(cliente2);

            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }


            // =================================
            // 3. TENTAR CADASTRAR SEM E-MAIL
            // =================================

            Cliente cliente3 = new Cliente(
                    "João Santos",
                    "",
                    "55566677788"
            );

            try {

                clienteService.cadastrarCliente(cliente3);

            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }


            // =================================
            // 4. CADASTRAR OUTRO CLIENTE
            // =================================

            Cliente cliente4 = new Cliente(
                    "Pedro Oliveira",
                    "pedro@email.com",
                    "99988877766"
            );

            clienteService.cadastrarCliente(cliente4);

            System.out.println(cliente4);

        } catch (SQLException e) {
            System.out.println("Erro ao acessar o banco de dados");
            e.printStackTrace();
        }
    }
}
