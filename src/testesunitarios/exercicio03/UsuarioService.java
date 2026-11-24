
package poo.testesunitarios.exercicio03;

public class UsuarioService {

    private UsuarioRepository repository;

    // Construtor
    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    // Atualizar e-mail do usuário
    public void atualizarEmail(Long id, String novoEmail) {

        Usuario usuario = repository.buscarPorId(id)
                .orElseThrow(() ->
                        new IllegalArgumentException(
                                "Usuário não encontrado."
                        )
                );

        usuario.setEmail(novoEmail);

        repository.salvar(usuario);
    }
}
