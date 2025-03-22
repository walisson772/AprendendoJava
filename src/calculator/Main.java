package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcoes;
        double result;
        Scanner sc = new Scanner(System.in);
        while (true){
            Calculator calcula = new Calculator();
            System.out.println("Digite um numero:");
            calcula.num1 = sc.nextDouble();
            System.out.println("Digite outro numero:");
            calcula.num2 = sc.nextDouble();

            calcula.opcoes();
            opcoes = sc.nextInt();
            if (opcoes == 1){
                result = calcula.soma();
                System.out.println(result);
            }
            else if (opcoes == 2) {
                result = calcula.subtrair();
                System.out.println(result);
            }
            else if (opcoes == 3) {
                result = calcula.dividir();
                System.out.println(result);
            }
            else if (opcoes == 4) {
                result = calcula.multiplicar();
                System.out.println(result);
            }
            else if (opcoes == 5) {
                break;
            }
            else {
                System.out.println("Essa opção não existe");
            }
        }
        sc.close();
    }
}
