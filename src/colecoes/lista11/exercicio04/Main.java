package colecoes.lista11.exercicio04;

public class Main {

    public static void main(String[] args) {

        Estoque estoque = new Estoque();

        //inserindo os produtos
        estoque.inserirProduto("P01", 10);
        estoque.inserirProduto("P02", 3);
        estoque.inserirProduto("P03", 7);
        estoque.inserirProduto("P04", 0);

        //atualizando o estoque
        estoque.atualizarEstoque("P01", 5);

        estoque.atualizarEstoque("P02", -1);

        //tentando atualizar produto que NÃO existe
        estoque.atualizarEstoque("P10", 5);

        estoque.exibirProdutos();

        //verificando o estoque baixo
        estoque.verificarEstoque();
    }
}