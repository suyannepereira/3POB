
package poo.testesunitarios.exercicio01;

public class ValidadorSenha {

    public boolean isForte(String senha) {

        // Verifica se a senha é nula ou vazia
        if (senha == null || senha.isEmpty()) {
            return false;
        }

        // Verifica se possui pelo menos 8 caracteres
        if (senha.length() < 8) {
            return false;
        }

        boolean temNumero = false;
        boolean temMaiuscula = false;

        // Percorre os caracteres da senha
        for (int i = 0; i < senha.length(); i++) {

            char caractere = senha.charAt(i);

            if (Character.isDigit(caractere)) {
                temNumero = true;
            }

            if (Character.isUpperCase(caractere)) {
                temMaiuscula = true;
            }
        }

        return temNumero && temMaiuscula;
    }
}
