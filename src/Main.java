import java.util.Locale;
import java.util.Scanner;
import aplication.Imc;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua altura em metros:");
        double altura = sc.nextDouble();
        System.out.println("Digite seu peso:");
        double peso = sc.nextDouble();
        String result = Imc.calcularImc(altura, peso);
        System.out.println(result);

        sc.close();
    }
}