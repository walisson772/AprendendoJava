package Loja.entities;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product{

    private LocalDate dataDeFabricacao;

    public UsedProduct(){
        super();
    }

    public UsedProduct(String name, Double price, LocalDate dataDeFabricacao){
        super(name, price);
        this.dataDeFabricacao = dataDeFabricacao;
    }

    public LocalDate getDataDeFabricacao() {
        return dataDeFabricacao;
    }

    public void setDataDeFabricacao(LocalDate dataDeFabricacao) {
        this.dataDeFabricacao = dataDeFabricacao;
    }

    @Override
    public String priceTag(){
        return super.getName() + " (usado) $" +String.format("%.2f", super.getPrice())+" "+
                "(Data de fabricação: "+dataDeFabricacao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}
