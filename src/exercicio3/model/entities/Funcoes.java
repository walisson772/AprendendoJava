package exercicio3.model.entities;


import exercicio3.model.exceptions.ErrorException;

public class Funcoes {

    private Double num1;
    private Double num2;
    private Integer escolha;

    public Funcoes(){
    }

    public Funcoes(Double num1, Double num2, Integer escolha){
        this.num1 = num1;
        this.num2 = num2;
        this.escolha = escolha;
    }

    public Double getNum1() {
        return num1;
    }

    public void setNum1(Double num1) {
        this.num1 = num1;
    }

    public Double getNum2() {
        return num2;
    }

    public void setNum2(Double num2) {
        this.num2 = num2;
    }

    public Integer getEscolha() {
        return escolha;
    }

    public void setEscolha(Integer escolha) {
        this.escolha = escolha;
    }

    public Double soma(){
        return num1 + num2;
    }

    public Double subtrair(){
        return num1 - num2;
    }

    public Double dividir() throws ErrorException{
        try{
            return num1 / num2;
        }
        catch (ArithmeticException e){
            System.out.println("Error: " + e.getMessage());
            return 0.0;
        }
    }

    public Double multiplicar(){
        return num1 * num2;
    }

    public String verificarOperacao() throws ErrorException{
        if (escolha == 1) {
            return "Resultado: "+soma();
        } else if (escolha == 2) {
            return "Resultado: "+ subtrair();
        }
        else if (escolha == 3){
            if (num2 == 0){
                throw new ErrorException("Error: Impossivel dividir um numero por zero.");
            }
            else {
                return "Resultado: "+dividir();
            }
        }
        else if (escolha == 4) {
            return  "Resultado: "+multiplicar();
        } else {
            return "Resultado: "+ 0.0;
        }
    }

    public void op(){
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Dividir");
        System.out.println("4 - Multiplicar");
        System.out.println("5 - Sair");
        System.out.print("Qual opção: ");
    }
}
