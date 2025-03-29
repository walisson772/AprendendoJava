package controledeestoque.util;

public class ControleDeEstoque {
    private Integer codigo;
    private Integer quantidade;
    private String nomeProduto;

    public ControleDeEstoque(){}

    public ControleDeEstoque(Integer codigo, Integer quantidade, String nomeProduto){
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.nomeProduto = nomeProduto;
    }

    public Integer getCodigo(){
        return codigo;
    }

    public void setCodigo(Integer codigo){
        this.codigo = codigo;
    }

    public Integer getQuantidade(){
        return quantidade;
    }

    public void setQuantidade(Integer quantidade){
        this.quantidade = quantidade;
    }

    public String getNomeProduto(){
        return nomeProduto;
    }

    public void setNomeProduto(String produto){
        this.nomeProduto = produto;
    }

    public void opcoes(){
        System.out.println("\n========= Gerenciador de Estoque =========");
        System.out.println("1 - Adicionar uma Item");
        System.out.println("2 - Listar Itens");
        System.out.println("3 - Remover uma quantidade de itens");
        System.out.println("4 - Sair");
        System.out.println("==========================================");
    }

    public String toString(){
        return "Produto: "+nomeProduto+" Quantidade: "+quantidade+" Codigo: "+codigo;
    }
}
