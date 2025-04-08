package Loja.aplication;

import Loja.entities.ImportedProduct;
import Loja.entities.Product;
import Loja.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o número de produtos: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            System.out.println("Dados do produto #"+i+":");
            System.out.print("Comum, Usado ou Importado (c,u,i)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Preço: ");
            double preco = sc.nextDouble();

            if (ch == 'i'){
                System.out.print("Taxa alfandegária: ");
                double taxa = sc.nextDouble();
                list.add(new ImportedProduct(nome, preco, taxa));
            }

            else if (ch == 'u'){
                System.out.print("Data de fabricação (dd/MM/yyyy): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new UsedProduct(nome, preco, date));
            }

            else {
                list.add(new Product(nome, preco));
            }

        }
        System.out.println();
        System.out.println("ETIQUETAS DE PREÇO");
        for (Product l : list){
            System.out.println(l.priceTag());
        }

        sc.close();
    }
}
