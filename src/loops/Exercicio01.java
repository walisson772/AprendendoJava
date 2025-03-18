package loops;


import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        while (x != 2002) {
            System.out.println("Acesso negado");
            x = sc.nextInt();
        }
        System.out.println("Acesso Permitido");
        sc.close();
    }
}
