package poo.lista09.exercicio03;

public class Usuario implements Autenticavel {

    private String login;
    private String senha;

    public Usuario(String login, String senha){
        this.login = login;
        this.senha = senha;
    }

    @Override
    public boolean autenticar(String senha){

        return this.senha.equals(senha);
    }
}