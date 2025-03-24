package exemploPoo02.aplication;

import java.util.Locale;
import java.util.Scanner;
import exemploPoo02.entities.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        

        System.out.println("Adicione um produto");
        System.out.print("Nome:");
        String name = sc.nextLine();

        System.out.print("Preco:");
        double preco = sc.nextDouble();

        System.out.print("Quantidade:");
        int quantity = sc.nextInt();
        Product product = new Product(name, preco, quantity);
        System.out.println("Produto: " + product);

        System.out.println();
        System.out.print("Entre com o numero de produtos para ser adionado no estoque:");
        quantity = sc.nextInt();
        product.addProdutos(quantity);
        System.out.println("Produtos atualizados: " + product);

        System.out.print("Entre com o numero de produtos para serem removidos do estoque:");
        quantity = sc.nextInt();
        product.removeProdutos(quantity);
        System.out.println("Produtos atualizados: " + product);
        sc.close();

    }
}
