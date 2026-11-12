package br.com.meusexercicios;

import br.com.meusexercicios.controle.PessoaController;
import br.com.meusexercicios.dominio.Pessoa;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PessoaController controller = new PessoaController();
        Scanner leitor = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n=== MENU DE OPCOES ===");
            System.out.println("1 - Incluir Pessoa");
            System.out.println("2 - Listar Pessoas");
            System.out.println("3 - Alterar Pessoa");
            System.out.println("4 - Excluir Pessoa");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            
            opcao = leitor.nextInt();
            leitor.nextLine(); // Limpa a quebra de linha

            try {
                switch (opcao) {
                    case 1:
                        System.out.print("ID: ");
                        int id = leitor.nextInt();
                        leitor.nextLine();

                        System.out.print("Nome: ");
                        String nome = leitor.nextLine();

                        System.out.print("Idade: ");
                        int idade = leitor.nextInt();

                        System.out.print("Altura (ex: 1.65): ");
                        double altura = leitor.nextDouble();

                        boolean ok = controller.incluir(id, nome, idade, altura);
                        if (ok) {
                            System.out.println("A pessoa foi incluida com sucesso!");
                        } else {
                            System.out.println("Erro: Ja existe uma pessoa com esse ID.");
                        }
                        break;

                    case 2:
                        List<Pessoa> lista = controller.listar();
                        System.out.println("\n--- LISTA DE PESSOAS ---");
                        if (lista.isEmpty()) {
                            System.out.println("Nenhuma pessoa foi cadastrada.");
                        } else {
                            for (int i = 0; i < lista.size(); i++) {
                                Pessoa p = lista.get(i);
                                System.out.println("ID: " + p.getId() + " | Nome: " + p.getNome() + 
                                                   " | Idade: " + p.getIdade() + " | Altura: " + p.getAltura());
                            }
                        }
                        break;

                    case 3:
                        System.out.print("Digite o ID da pessoa para alterar: ");
                        int idAlterar = leitor.nextInt();
                        leitor.nextLine();

                        System.out.print("Novo Nome: ");
                        String novoNome = leitor.nextLine();

                        System.out.print("Nova Idade: ");
                        int novaIdade = leitor.nextInt();

                        System.out.print("Nova Altura: ");
                        double novaAltura = leitor.nextDouble();

                        boolean alterou = controller.alterar(idAlterar, novoNome, novaIdade, novaAltura);
                        if (alterou) {
                            System.out.println("Pessoa alterada com sucesso!");
                        } else {
                            System.out.println("O ID nao foi encontrado!");
                        }
                        break;

                    case 4:
                        System.out.print("Digite o ID da pessoa para excluir: ");
                        int idExcluir = leitor.nextInt();

                        boolean excluiu = controller.excluir(idExcluir);
                        if (excluiu) {
                            System.out.println("A pessoa excluida com sucesso!");
                        } else {
                            System.out.println("O ID nao foi encontrado!");
                        }
                        break;

                    case 0:
                        System.out.println("Saindo do sistema...");
                        break;

                    default:
                        System.out.println("Opção inválida!");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Erro na operação: " + e.getMessage());
            }
        }
        leitor.close();
    }
}