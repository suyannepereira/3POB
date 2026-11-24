
package poo.dao.exercicio04;

import java.sql.SQLException;
import java.util.Optional;

public class ClienteService {

    private ClienteDAO clienteDAO;

    //injeção de dependência pelo o construtor
    public ClienteService(ClienteDAO clienteDAO) {

        this.clienteDAO = clienteDAO;
    }

    //cadastra o cliente com validações
    public void cadastrarCliente(Cliente cliente)
            throws SQLException {

        //alida o e-mail
        if (cliente.getEmail() == null || cliente.getEmail().trim().isEmpty()) {

            throw new IllegalArgumentException("O e-mail não pode ser nulo ou vazio");
        }

        //validao CPF
        if (cliente.getCpf() == null  || cliente.getCpf().trim().isEmpty()) {

            throw new IllegalArgumentException("O CPF nao pode ser nulo ou vazio");
        }

        //verifica se o CPF já está cadastrado
        Optional<Cliente> resultado =
                clienteDAO.buscarPorCpf(cliente.getCpf());

        if (resultado.isPresent()) {

            throw new IllegalArgumentException("Ja existe um cliente cadastrado com esse CPF");
        }

        //se passou pelas validações, salva
        clienteDAO.salvar(cliente);

        System.out.println("Cliente cadastrado com sucesso");
    }
}
