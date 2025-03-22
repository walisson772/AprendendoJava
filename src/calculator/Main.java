package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao;
        Scanner sc = new Scanner(System.in);
        while (true){
            Calculator calcula = new Calculator();
            calcula.opcoes();
            opcao = sc.nextInt();
            if (opcao == 5) {
                System.out.println("Encerrando a calculadora");
                break;
            }
            System.out.println("Digite um numero:");
            calcula.num1 = sc.nextDouble();
            System.out.println("Digite outro numero:");
            calcula.num2 = sc.nextDouble();

            calcula.condicoes(opcao);
        }
        sc.close();
    }
}
