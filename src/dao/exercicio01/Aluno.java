
package poo.dao.exercicio01;

public class Aluno {

    private int id;
    private String nome;
    private String matricula;

    //construtor
    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Nome: " + nome + " | Matricula: " + matricula;
    }
}
