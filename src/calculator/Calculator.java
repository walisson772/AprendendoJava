package calculator;

public class    Calculator {
    public double num1;
    public double num2;
    public int escolha;

    public void opcoes() {
        System.out.println("Opções disponiveis:");
        System.out.println("1) Somar");
        System.out.println("2) Subtrair");
        System.out.println("3) Dividir");
        System.out.println("4) Multiplicar");
        System.out.println("5) Sair");
    }

    public void condicoes(int escolha) {
        this.escolha = escolha;
        double result;
        if (this.escolha == 1){
            result = soma();
            System.out.println(result);
        }
        else if (this.escolha == 2) {
            result = subtrair();
            System.out.println(result);
        }
        else if (this.escolha == 3) {
            result = dividir();
            System.out.println(result);
        }
        else if (this.escolha == 4) {
            result = multiplicar();
            System.out.println(result);
        }
        else {
            System.out.println("Essa opção não existe");
        }
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
