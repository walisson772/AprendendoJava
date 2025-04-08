package Loja.entities;

public class ImportedProduct extends Product{

    private Double taxaAlfandegaria;

    public ImportedProduct(){
        super();
    }

    public ImportedProduct(String name, Double price, Double taxaAlfandegaria){
        super(name, price);
        this.taxaAlfandegaria = taxaAlfandegaria;
    }

    public Double getTaxaAlfandegaria() {
        return taxaAlfandegaria;
    }

    public void setTaxaAlfandegaria(Double taxaAlfandegaria) {
        this.taxaAlfandegaria = taxaAlfandegaria;
    }

    public Double totalPrice(){
        return super.getPrice() + taxaAlfandegaria;
    }

    @Override
    public String priceTag(){
        return super.getName() +" $"+
                String.format("%.2f", totalPrice())+
                " (taxa alfandegária: "+ taxaAlfandegaria+")";
    }
}
