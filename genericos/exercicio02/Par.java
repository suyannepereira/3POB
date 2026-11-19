
package poo.genericos.exercicio02;

import java.util.Objects;

public class Par<K, V> {

    private final K chave;
    private final V valor;

    // Construtor
    public Par(K chave, V valor) {
        this.chave = chave;
        this.valor = valor;
    }

    // Retorna a chave
    public K getChave() {
        return chave;
    }

    // Retorna o valor
    public V getValor() {
        return valor;
    }

    // Representação do par em formato de texto
    @Override
    public String toString() {
        return "[Chave: " + chave + ", Valor: " + valor + "]";
    }

    // Compara dois pares
    public static <K, V> boolean saoIguais(Par<K, V> p1, Par<K, V> p2) {

        return Objects.equals(p1.getChave(), p2.getChave())
                && Objects.equals(p1.getValor(), p2.getValor());
    }
}
