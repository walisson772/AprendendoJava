package cotacaodolar.aplication;

import cotacaodolar.util.ConversorDeMoeda;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o valor do dolar: ");
        double valorDola = sc.nextDouble();
        System.out.print("Quantos dolares você deseja comprar: ");
        double qtdDolas = sc.nextDouble();
        double result = ConversorDeMoeda.converter(valorDola, qtdDolas);
        System.out.printf("Valot total a pagar por %.2f dolares = R$ %.2f", qtdDolas, result);

        sc.close();
    }
}
