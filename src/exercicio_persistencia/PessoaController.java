package exercicio_persistencia;


import java.io.IOException;
import java.util.List;

public class PessoaController {

    private PessoaDAO dao = new PessoaDAO();

    // 1. INCLUIR
    public boolean incluir(int id, String nome, int idade, double altura) throws IOException {
        List<Pessoa> pessoas = dao.buscarTodas();
        
        // Verifica se o ID ja existe
        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).getId() == id) {
                return false; // ID duplicado
            }
        }

        Pessoa novaPessoa = new Pessoa(id, nome, idade, altura);
        dao.salvar(novaPessoa);
        return true;
    }

    // 2. LISTAR
    public List<Pessoa> listar() throws IOException {
        return dao.buscarTodas();
    }

    // 3. ALTERAR
    public boolean alterar(int id, String novoNome, int novaIdade, double novaAltura) throws IOException {
        List<Pessoa> pessoas = dao.buscarTodas();
        boolean encontrou = false;

        for (int i = 0; i < pessoas.size(); i++) {
            Pessoa p = pessoas.get(i);
            if (p.getId() == id) {
                p.setNome(novoNome);
                p.setIdade(novaIdade);
                p.setAltura(novaAltura);
                encontrou = true;
                break;
            }
        }

        if (encontrou) {
            dao.reescreverArquivo(pessoas);
            return true;
        }
        return false;
    }

    // 4. EXCLUIR
    public boolean excluir(int id) throws IOException {
        List<Pessoa> pessoas = dao.buscarTodas();
        boolean removido = false;

        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).getId() == id) {
                pessoas.remove(i);
                removido = true;
                break;
            }
        }

        if (removido) {
            dao.reescreverArquivo(pessoas);
            return true;
        }
        return false;
    }
}
