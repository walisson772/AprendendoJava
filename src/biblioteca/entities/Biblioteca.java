package biblioteca.entities;

import java.util.List;

public class Biblioteca {

    private Integer id;
    private String titulo;
    private String autor;
    private Integer anoPublicacao;
    private Boolean disponivel = true;

    public Biblioteca(){}

    public Biblioteca(Integer id, String titulo, String autor, Integer anoPublicacao){
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public Integer getId(){
        return id;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(Integer anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public Boolean getDisponivel(){
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel){
        this.disponivel = disponivel;
    }

    public void op(){
        System.out.println("=====================================================");
        System.out.println("1 - Cadastrar livros");
        System.out.println("2 - Listar livros disponíveis");
        System.out.println("3 - Emprestar um livro");
        System.out.println("4 - Devolver um livro");
        System.out.println("5 - Sair");
        System.out.println("=====================================================");
        System.out.print("O que você deseja? ");

    }

    public void listarLivros(List livros){
        for (Object livro : livros){
            System.out.println(livro);
        }
    }

    public String toString(){
        return "Id: " + id + " Titulo: " + titulo + " autor: " + autor + " disponivel: " + disponivel;
    }

}
