package exemploPoo01.aplication;

import java.util.Locale;
import java.util.Scanner;

import exemploPoo01.entities.Triangle;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("insira as medidas do triângulo x:");
        x.a= sc.nextDouble();
        x.b= sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("insira as medidas do triângulo y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();

        
        double areaY = y.area();

        System.out.printf("Triangolo x area: %.4f%n", areaX);
        System.out.printf("Triangolo y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Maior area é do X");
        }
        else {
            System.out.println("Maior area é do Y");
        }
        sc.close();
    }
}