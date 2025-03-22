package calculator;

public class Calculator {
    public double num1;
    public double num2;

    public void opcoes() {
        System.out.println("1) Somar");
        System.out.println("2) Subtrair");
        System.out.println("3) Dividir");
        System.out.println("4) Multiplicar");
        System.out.println("5) Sair");
    }

    public double soma() {
        this.num1 = num1;
        this.num2 = num2;
        return this.num1 + this.num2;
    }

    public double subtrair() {
        this.num1 = num1;
        this.num2 = num2;
        return this.num1 - this.num2;
    }

    public double dividir() {
        this.num1 = num1;
        this.num2 = num2;
        return this.num1 / this.num2;
    }

    public double multiplicar() {
        this.num1 = num1;
        this.num2 = num2;
        return this.num1 * this.num2;
    }
}
