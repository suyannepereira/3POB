package poo.lista09.exercicio03;

public class Main {

    public static void main(String[] args) {

        Usuario usuario = new Usuario("suyanne", "1234");

        Administrador administrador = new Administrador("admin", "abcd", 10);

        System.out.println(usuario.autenticar("1234"));

        System.out.println(administrador.autenticar("abcd"));

        System.out.println(administrador.exportarJSON());
    }
}