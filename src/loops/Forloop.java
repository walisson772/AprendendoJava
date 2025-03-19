package loops;

import java.util.Scanner;

public class Forloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero para ver sua tabuada");
        int x = sc.nextInt();
        for (int i=0; i<10; i++) {
            int soma = x + i;
            System.out.printf("%d + %d = %d%n", x, i, soma);
        }
        sc.close();
    }
}
