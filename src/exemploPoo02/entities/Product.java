package exemploPoo02.entities;

public class Product {
    public String name;
    public double preco;
    public int quantidade;

    public double valorTotalNoEstoque() {
        return preco * quantidade;
    }

    public void addProdutos(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removeProdutos(int quantidade) {
        this.quantidade -= quantidade;
    }

    public String toString() {
        return name +
                ", $ " +
                String.format("%.2f", preco) +
                ", " +
                quantidade +
                " unidades,  Total $ " +
                String.format("%.2f", valorTotalNoEstoque());
    }
}

