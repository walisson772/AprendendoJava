package sytemloja.aplication;

import sytemloja.entitie.Cliente;
import sytemloja.entitie.Order;
import sytemloja.entitie.OrderItem;
import sytemloja.entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Date data = new Date();

        System.out.println("Insira os dados do cliente:");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("E-mail: ");
        String email = sc.nextLine();
        System.out.print("Data de nascimento (dd/MM/yyyy): ");
        Date dataDeNascimento = fmt.parse(sc.next());
        Cliente cliente = new Cliente(nome, email, dataDeNascimento);

        System.out.println("Insira os dados do pedido:");
        System.out.print("Status: ");
        sc.nextLine();
        String status = sc.nextLine();
        System.out.print("Quantos itens há neste pedido? ");
        int qtd = sc.nextInt();
        for (int i=1; i<=qtd; i++){
            System.out.println("Digite os dados do item nº "+i+":");
            System.out.print("Nome do produto: ");
            sc.nextLine();
            String nomeProduto = sc.nextLine();
            System.out.print("Preço do produto: ");
            double precoProduto = sc.nextDouble();
            System.out.print("Quantidade: ");
            int quantidade = sc.nextInt();
            OrderItem orderItem = new OrderItem(quantidade, precoProduto);
            System.out.println("Subtotal = "+orderItem.subTotal());
        }
        Order order = new Order(data, OrderStatus.valueOf(status));

        System.out.println("RESUMO DO PEDIDO:");
        System.out.println("Momento do pedido: "+data);
        System.out.println("Status do pedido: "+order.getStatus());
        System.out.println("Cliente: "+cliente.getName()+" "+cliente.getNascimento()+" "+cliente.getEmail());
        System.out.println("Itens do pedido: ");
        System.out.println();



        sc.close();
    }
}
