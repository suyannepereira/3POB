
package poo.testesunitarios.exercicio01;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

public class ValidadorSenhaTest {

    private ValidadorSenha validador = new ValidadorSenha();

    // Testando senhas fortes
    @ParameterizedTest
    @ValueSource(strings = {
            "Senha123",
            "Java2026",
            "TesteABC1",
            "Programacao9",
            "Aluno2026"
    })
    public void testarSenhasFortes(String senha) {

        assertTrue(validador.isForte(senha));
    }

    // Testando senhas inválidas
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {
            "Ab1",
            "senhaforte",
            "SENHAFORTE",
            "12345678",
            "abc12345"
    })
    public void testarSenhasFracas(String senha) {

        assertFalse(validador.isForte(senha));
    }
}
