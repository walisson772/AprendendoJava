import java.util.Scanner;

public class exercicio003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();

        if (num < 0) {
            System.out.printf("%d é um numero negativo%n", num);
        }
        else {
            System.out.printf("%d é um numero positivo%n", num);
        }
    }
}
