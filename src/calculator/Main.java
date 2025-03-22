package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcoes;
        Scanner sc = new Scanner(System.in);
        while (true){
            Calculator calcula = new Calculator();
            calcula.opcoes();
            opcoes = sc.nextInt();
            if (opcoes == 5) {
                break;
            }
            System.out.println("Digite um numero:");
            calcula.num1 = sc.nextDouble();
            System.out.println("Digite outro numero:");
            calcula.num2 = sc.nextDouble();

            calcula.condicoes(opcoes);
        }
        sc.close();
    }
}
