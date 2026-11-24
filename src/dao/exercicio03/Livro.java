
package poo.dao.exercicio03;

public class Livro {

    private Long id;
    private String titulo;
    private String autor;

    //construtor
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Titulo: " + titulo + " | Autor: " + autor;
    }
}
