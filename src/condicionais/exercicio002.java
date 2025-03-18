package condicionais;

import java.util.Scanner;

//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
public class exercicio002 {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();
        sc.close();

        if (numero % 2  == 0) {
            System.out.printf("O numero %d é par%n", numero);
        }
        else {
            System.out.printf("O numero %d é impar%n", numero);
        }
    }
}
