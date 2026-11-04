package br.com.meusexercicios.dominio;

public class Pessoa{
    private int id;
    private String nome;
    private int idade;
    private double altura;

    //Construtor
    public Pessoa(int id, String nome, int idade, double altura){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    //Getters e Setters
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    //Converte "Pessoa" para salvar no arquivo (ex: 1;Maria;20;1.65)
    public String toCSV(){
        return id + ";" + nome + ";" + idade + ";" + altura;
    }

    //Converte a linha do arquivo para criar uma "Pessoa"
    public static Pessoa fromCSV(String linha){
        String[] partes = linha.split(";");
        int id = Integer.parseInt(partes[0]);
        String nome = partes[1];
        int idade = Integer.parseInt(partes[2]);
        double altura = Double.parseDouble(partes[3]);
        
        return new Pessoa(id, nome, idade, altura);
    }
}