package vetores.exemplo;

import java.util.Locale;
import java.util.Scanner;

public class Soma_vetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i=0; i<vect.length; i++) {
            System.out.print("Digite um numero:");
            double num = sc.nextDouble();
            vect[i] = num;
        }
        double sum, media;
        sum = 0;
        for (int i=0; i<vect.length; i++) {
            sum += vect[i];
        }
        media = sum / n;
        System.out.print("Valores = ");
        for (int i=0; i<vect.length; i++) {
            System.out.printf("%.1f ", vect[i]);
        }
        System.out.printf("%nSoma: %.2f%n", sum);
        System.out.println("Media: "+ media);

        sc.close();
    }
}
