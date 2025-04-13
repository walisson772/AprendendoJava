package controledeestoque.util;

public class ControleDeProdutos extends ControleDeEstoque{

    private Double valorUnidade;

    public ControleDeProdutos(){
        super();
    }

    public ControleDeProdutos(Integer codigo, Integer quantidade, String nomeProduto, Double precoTotal, Double valorUnidade){
        super(codigo, quantidade, nomeProduto, precoTotal);
        this.valorUnidade = valorUnidade;
    }

    public Double getValorUnidade(){
        return valorUnidade;
    }

    public void setValorUnidade(Double valorUnidade){
        this.valorUnidade = valorUnidade;
    }

    public void novasUnidades(Integer unidades){
        int addUnidades = getQuantidade() + unidades;
        setQuantidade(addUnidades);
        double valorTotal = getValorUnidade() * unidades + getPrecoTotal();
        setPrecoTotal(valorTotal);
    }
}
