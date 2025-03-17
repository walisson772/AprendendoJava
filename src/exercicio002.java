import java.util.Scanner;

public class exercicio002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2, saida;

        num1 = sc.nextInt();
        num2 = sc.nextInt();
        saida = num1 + num2;

        System.out.printf("Entrada: %d e %d%n", num1, num2);
        System.out.printf("Saida soma:%d%n", saida);

        sc.close();
    }
}
