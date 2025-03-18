package condicionais;

import java.util.Scanner;

public class exercicio003 {
    public static void main(String[] args) {
        int codigo, qtd;
        String especificacao = "";
        double preco = 0;

        System.out.println("Codigo   Especificação  Preço");
        System.out.println("1 Cachorro quente 4.50");
        System.out.println("2 X-Salada 7.50");
        System.out.println("3 X-Bacon 8.50");

        Scanner sc = new Scanner(System.in);
        codigo = sc.nextInt();
        sc.nextLine();
        qtd = sc.nextInt();
        sc.close();

        if (codigo == 1){
            especificacao = "Cachorro quente";
            preco = qtd * 4.50;
        }
        else if (codigo == 2) {
            especificacao = "X-Salada";
            preco = qtd * 7.50;
        }
        else if (codigo == 3) {
            especificacao = "X-Bacon";
            preco = qtd * 8.50;
        }
        System.out.printf("Item: %s, Quantidade: %d, Valor: %.2f%n", especificacao, qtd, preco);
    }
}
