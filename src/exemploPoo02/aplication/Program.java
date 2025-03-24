package exemploPoo02.aplication;

import java.util.Locale;
import java.util.Scanner;
import exemploPoo02.entities.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Product product = new Product();
        System.out.println("Adicione um produto");
        System.out.print("Nome:");
        product.name = sc.nextLine();

        System.out.print("Preco:");
        product.preco = sc.nextDouble();

        System.out.print("Quantidade:");
        product.quantidade = sc.nextInt();
        System.out.println("Produto: " + product);

        System.out.println();
        System.out.print("Entre com o numero de produtos para ser adionado no estoque:");
        int quantity = sc.nextInt();
        product.addProdutos(quantity);
        System.out.println("Produtos atualizados: " + product);

        System.out.print("Entre com o numero de produtos para serem removidos do estoque:");
        quantity = sc.nextInt();
        product.removeProdutos(quantity);
        System.out.println("Produtos atualizados: " + product);
        sc.close();

    }
}
