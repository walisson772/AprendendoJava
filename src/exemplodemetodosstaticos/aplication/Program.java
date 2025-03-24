package exemplodemetodosstaticos.aplication;

import exemplodemetodosstaticos.util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite o valor do raio: ");
        double raio = sc.nextDouble();

        double c = Calculator.circuferencia(raio);

        double v = Calculator.volume(raio);

        System.out.printf("Circunferencia: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI: %.2f%n", Calculator.PI);

        sc.close();
    }


}
