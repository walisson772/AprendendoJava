package vetores.exemplo;

import java.util.Scanner;

public class Numeros_pares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar?");
        int n = sc.nextInt();
        int[] vetor = new int[n];

        int value;
        for (int i=0; i<vetor.length; i++) {
            System.out.print("Digite um numero:");
            value = sc.nextInt();
            vetor[i] = value;
        }

        int qtd = 0;
        System.out.println("Numeros pares:");
        for (int i=0; i<vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.println(vetor[i]   );
                qtd += 1;
            }
        }
        System.out.printf("%nQuantidade de numeros pares: %d", qtd);

        sc.close();
    }
}
