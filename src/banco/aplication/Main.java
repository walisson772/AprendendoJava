package banco.aplication;


import banco.entities.SistemaBancario;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double deposito;

        System.out.print("Insira o número da conta: ");
        int numeroConta = sc.nextInt();

        System.out.print("Insira o titular da conta: ");
        String nome = sc.next();

        System.out.print("Há um depósito inicial (s/n)?");
        char escolha = sc.next().charAt(0);
        SistemaBancario systemBanc = new SistemaBancario(nome, numeroConta, escolha);

        if (escolha == 's') {
            System.out.print("Insira o valor do depósito inicial:");
            deposito = sc.nextDouble();
            systemBanc.setSaldoConta(deposito);
        }
        System.out.printf("Dados da conta: %d, %s, Saldo: %.2f%n", numeroConta, nome, systemBanc.getSaldoConta());

        System.out.print("Insira um valor de depósito:");
        deposito = sc.nextDouble();
        systemBanc.deposito(deposito);

        System.out.println("Dados atualizados da conta:");
        System.out.printf("Dados da conta: %d, %s, Saldo: %.2f%n", numeroConta, nome, systemBanc.getSaldoConta());

        System.out.print("Insira um valor de retirada:");
        double retirada = sc.nextDouble();
        System.out.printf("Dados da conta: %d, %s, Saldo: %.2f", numeroConta, nome, systemBanc.retirada(retirada));


        sc.close();
    }
}
