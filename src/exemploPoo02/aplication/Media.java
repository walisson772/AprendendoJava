package exemploPoo02.aplication;

import java.util.Locale;
import java.util.Scanner;

public class Media {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota da primeira unidade: ");
        double n1 = sc.nextDouble();
        System.out.print("Digite a nota da segunda unidade: ");
        double n2 = sc.nextDouble();
        System.out.print("Digite a nota da terceira unidade: ");
        double n3 = sc.nextDouble();

        double media = (n1 + n2 + n3) / 3;
        if (media >= 5) {
            System.out.println("Aluno aprovado.");
        }
        else {
            System.out.println("Aluno reprovado");
        }
        System.out.printf("Media do aluno é = %.1f", media);

        sc.close();
    }
}
