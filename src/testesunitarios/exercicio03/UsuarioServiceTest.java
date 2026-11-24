
package poo.testesunitarios.exercicio03;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;
import static org.mockito.ArgumentMatchers.any;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class UsuarioServiceTest {

    @Mock
    private UsuarioRepository repository;

    @InjectMocks
    private UsuarioService service;

    @Test
    public void testarAtualizacaoEmail() {

        // Criando usuário existente
        Usuario usuario = new Usuario(
                1L,
                "Ana",
                "ana@email.com"
        );

        // Simulando a busca do usuário
        when(repository.buscarPorId(1L))
                .thenReturn(Optional.of(usuario));

        // Executando o método
        service.atualizarEmail(
                1L,
                "ana.novo@email.com"
        );

        // Verificando se o e-mail foi atualizado
        assertEquals(
                "ana.novo@email.com",
                usuario.getEmail()
        );

        // Verificando se o método salvar foi chamado uma vez
        verify(repository, times(1))
                .salvar(any(Usuario.class));
    }

	private Object when(Optional<Usuario> buscarPorId) {
		// TODO Auto-generated method stub
		return null;
	}
}
