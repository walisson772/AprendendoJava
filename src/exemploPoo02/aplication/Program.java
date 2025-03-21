package exemploPoo02.aplication;

import java.util.Locale;
import java.util.Scanner;
import exemploPoo02.entities.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Product product = new Product();
        System.out.print("Adicione um produto:");
        System.out.print("Nome:");
        product.name = sc.nextLine();
        System.out.print("Preco:");
        product.preco = sc.nextDouble();
        System.out.print("Quantidade:");
        product.quantidade = sc.nextInt();
        sc.close();

    }
}
