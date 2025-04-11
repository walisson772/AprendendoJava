package controledeestoque.util;

public class ControleDeEstoque {
    private Integer codigo;
    private Integer quantidade;
    private String nomeProduto;
    private Double precoTotal;
    private Double valorUnidade;

    public ControleDeEstoque(){}


    public ControleDeEstoque(Integer codigo, Integer quantidade, String nomeProduto, Double precoTotal, Double valorUnidade){
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.nomeProduto = nomeProduto;
        this.precoTotal = precoTotal;
        this.valorUnidade = valorUnidade;
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

    public Double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(Double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public Double getValorUnidade(){
        return valorUnidade;
    }

    public void setValorUnidade(Double valorUnidade){
        this.valorUnidade = valorUnidade;
    }


    public void opcoes(){
        System.out.println("\n========= Gerenciador de Estoque =========");
        System.out.println("1 - Adicionar uma Item");
        System.out.println("2 - Listar Itens");
        System.out.println("3 - Remover uma quantidade de itens");
        System.out.println("4 - Adicionar mais unidades a um produto do estoque");
        System.out.println("5 - Sair");
        System.out.println("==========================================");
    }

    public String toString(){
        return "Produto: "+nomeProduto+" Quantidade: "+quantidade+" Codigo: "+codigo+" Valor total: "+String.format("%.2f",precoTotal);
    }
}
