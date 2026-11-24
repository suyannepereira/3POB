
package poo.testesunitarios.exercicio02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContaBancariaTest {

    private ContaBancaria conta;

    // Executado antes de cada teste
    @BeforeEach
    public void configurarConta() {

        conta = new ContaBancaria(1000.00);
    }

    // Testar depósito
    @Test
    public void testarDeposito() {

        conta.depositar(500.00);

        assertEquals(1500.00, conta.getSaldo(), 0.001);
    }

    // Testar saque válido
    @Test
    public void testarSaque() {

        conta.sacar(200.00);

        assertEquals(800.00, conta.getSaldo(), 0.001);
    }

    // Testar saque com saldo insuficiente
    @Test
    public void testarSaldoInsuficiente() {

        SaldoInsuficienteException excecao =
                assertThrows(
                        SaldoInsuficienteException.class,
                        () -> conta.sacar(2000.00));

        assertEquals("Saldo insuficiente para realizar o saque", excecao.getMessage());
    }

    // Testar saque com valor inválido
    @Test
    public void testarSaqueValorInvalido() {

        IllegalArgumentException excecao =
                assertThrows(
                        IllegalArgumentException.class,
                        () -> conta.sacar(0)
                );

        assertEquals("O valor do saque deve ser positivo.", excecao.getMessage());
    }
}
