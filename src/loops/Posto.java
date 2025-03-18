package loops;

import java.util.Scanner;

public class Posto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int diesel = 0;
        int gasolina = 0;
        int alcool = 0;
        while (true) {
            System.out.println("1) Álcool");
            System.out.println("2) Gasolina");
            System.out.println("3) Diesel");
            System.out.println("4) Sair");
            x = sc.nextInt();
            if (x == 1) {
                alcool += 1;
            }
            else if (x == 2) {
                gasolina += 1;
            }
            else if (x == 3) {
                diesel += 1;
            }
            else if (x == 4) {
                System.out.println("Muito Obrigado");
                System.out.printf("Álcool: %d%n", alcool);
                System.out.printf("Gasolina: %d%n", gasolina);
                System.out.printf("Diesel: %d%n", diesel);
                break;
            }
        }
        sc.close();
    }
}
