package controledeestoque.util;

public class ControleDeProdutos extends ControleDeEstoque{

    public ControleDeProdutos(){
        super();
    }

    public ControleDeProdutos(Integer codigo, Integer quantidade, String nomeProduto, Double precoTotal, Double valorUnidade){
        super(codigo, quantidade, nomeProduto, precoTotal, valorUnidade);
    }

    public void novasUnidades(Integer unidades){
        int addUnidades = getQuantidade() + unidades;
        setQuantidade(addUnidades);
        double valorTotal = getValorUnidade() * unidades + getPrecoTotal();
        setPrecoTotal(valorTotal);
    }
}
