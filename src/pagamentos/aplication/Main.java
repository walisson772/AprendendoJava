package pagamentos.aplication;

import pagamentos.entities.Pagamentos;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // Configurações inicias do programa
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Pagamentos funcionario = new Pagamentos();

        // Pede para que o funcionario digite seu nome
        System.out.print("Nome:");
        funcionario.nome = sc.nextLine();

        // Pede para o funcionario digite seu salario bruto
        System.out.print("Salario bruto:");
        funcionario.salarioBruto = sc.nextDouble();

        // Pede para o funcionario inforamr a taxa
        System.out.print("Taxa:");
        funcionario.taxa = sc.nextDouble();

        // Mostra o salario liquido e pede para digitar a porcentagem de aumento
        System.out.printf("Salario liquido: %s, %.2f%n", funcionario.nome,funcionario.salarioLiquido());
        System.out.println("Qual porcentagem sera acressentada: ");

        // Mostra o nono salario
        double almento = sc.nextDouble();
        funcionario.aumentoSalario(almento);
        sc.close();
    }
}
