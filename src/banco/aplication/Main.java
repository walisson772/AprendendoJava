package banco.aplication;

import banco.entities.SistemaBancario;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SistemaBancario systemBanc = new SistemaBancario();
        System.out.print("Digite seu nome:");
        systemBanc.nome = sc.nextLine();
        System.out.printf("Prazer em te ver aqui sr %s%n", systemBanc.nome);

        while (true) {
            systemBanc.opcoes();
            systemBanc.escolha = sc.nextInt();

            if (systemBanc.escolha == 2) {
                System.out.print("Digite o valor a ser depositado na conta:");
                systemBanc.adcionarSaldo = sc.nextDouble();
                systemBanc.adcionarSaldoAConta(systemBanc.adcionarSaldo);
            }
            else if (systemBanc.escolha == 4) {
                System.out.print("Digite o valor a ser removido da conta:");
                double valor = sc.nextDouble();
                systemBanc.removeSaldo(valor);
            }
            else if (systemBanc.escolha == 5) {
                break;
            }
            systemBanc.condicoes();
        }
        sc.close();
    }
}
