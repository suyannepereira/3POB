
package poo.genericos.exercicio01;

public class Caixa<T> {

    private T conteudo;

    // Guarda um elemento dentro da caixa
    public void guardar(T elemento) {
        conteudo = elemento;
    }

    // Recupera o elemento que foi armazenado
    public T recuperar() {
        return conteudo;
    }

    // Verifica se a caixa está vazia
    public boolean isVazia() {
        return conteudo == null;
    }

    // Remove o elemento que foi armazenado
    public void limpar() {
        conteudo = null;
    }
}
