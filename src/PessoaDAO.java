package br.com.meusexercicios.persistencia;

import br.com.meusexercicios.dominio.Pessoa;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PessoaDAO{

    private String nomeArquivo = "Pessoas.csv";

    //O construtor garante que o arquivo exista
    public PessoaDAO(){
        try{
            File arquivo = new File(nomeArquivo);
            if(!arquivo.exists()){
                arquivo.createNewFile();
            }
        }catch(IOException e){
            System.out.println("Ocorreu um erro ao criar o arquivo: " + e.getMessage());
        }
    }

    //Lê todas as pessoas do arquivo CSV
    public List<Pessoa> buscarTodas() throws IOException{
        List<Pessoa> lista = new ArrayList<>();
        File arquivo = new File(nomeArquivo);
        
        Scanner leitor = new Scanner(arquivo);
        while(leitor.hasNextLine()){
            String linha = leitor.nextLine();
            if(!linha.trim().isEmpty()){
                Pessoa p = Pessoa.fromCSV(linha);
                lista.add(p);
            }
        }
        leitor.close();
        return lista;
    }

    //Adiciona uma pessoa no final do arquivo
    public void salvar(Pessoa pessoa) throws IOException{
        FileWriter fw = new FileWriter(nomeArquivo, true);
        PrintWriter pw = new PrintWriter(fw);
        pw.println(pessoa.toCSV());
        pw.close();
        fw.close();
    }

    //Reescreve o arquivo com a lista atualizada
    public void reescreverArquivo(List<Pessoa> lista) throws IOException{
        FileWriter fw = new FileWriter(nomeArquivo, false);
        PrintWriter pw = new PrintWriter(fw);
        
        for(int i = 0; i < lista.size(); i++){
            Pessoa p = lista.get(i);
            pw.println(p.toCSV());
        }
        
        pw.close();
        fw.close();
    }
}