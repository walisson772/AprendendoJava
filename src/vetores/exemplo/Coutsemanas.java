package vetores.exemplo;

import vetores.intities.Semanas;

import java.util.Scanner;

public class Coutsemanas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de semanas: ");
        int semanas = sc.nextInt();

        Semanas sem = new Semanas(semanas);
        System.out.printf("Quantidade de dias em %d é %d", semanas, sem.getSemana());


        sc.close();
    }
}
