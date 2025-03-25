package vetores.exemplo;

import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar: ");
        int n = sc.nextInt();
        int[] vect = new int[n];

        for (int i=0; i<vect.length; i++) {
            System.out.print("Digite um numero: ");
            int numero = sc.nextInt();
            vect[i] = numero;
        }

        System.out.println("Numeros negativos: ");
        for (int i=0; i<vect.length; i++) {
            if (vect[i] < 0) {
                System.out.println(vect[i]);
            }
        }

        sc.close();
    }
}
