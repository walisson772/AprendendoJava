package biblioteca.entities;

public class Biblioteca {

    private Integer id;
    private String titulo;
    private String autor;
    private Integer anoPublicacao;
    private Boolean disponivel;

    public Biblioteca(){}

    private Biblioteca(Integer id, String titulo, String autor, Integer anoPublicacao, Boolean disponivel){
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = disponivel;
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
        System.out.println("1 - Cadastrar livros");
        System.out.println("2 - Listar livros disponíveis");
        System.out.println("3 - Emprestar um livro");
        System.out.println("4 - Devolver um livro");
        System.out.println("5 - Sair");
        System.out.print("O que você deseja? ");
    }
}
