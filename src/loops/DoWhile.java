package loops;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char resposta;
        do {
            System.out.println("Digite a temperatura em celsius: ");
            double x = sc.nextDouble();
            double f = 9.0 * x / 5.0 + 32.0;
            System.out.printf("Equevalente em Fahrenheit: %.1f%n", f);
            System.out.print("Deseja repetir (s/n)? ");
            resposta = sc.next().charAt(0);
        }while (resposta != 'n');
        sc.close();
    }
}
