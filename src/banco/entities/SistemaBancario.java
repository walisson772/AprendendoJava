package banco.entities;

import java.util.Scanner;

public class SistemaBancario {
    private double saldoDaConta;
    public double adcionarSaldo;
    public int escolha;
    public String nome;

    public void verSaldoDaConta(){
        if (saldoDaConta == 0) {
            System.out.println("A sua conta está vazia");
        }
        System.out.println("Saldo da conta é: "+ saldoDaConta);
    }

    public void adcionarSaldoAConta(double adcionarSaldo) {
        this.adcionarSaldo = adcionarSaldo;
        saldoDaConta += this.adcionarSaldo;
        System.out.println("Saldo na conta é " + saldoDaConta);
    }

    public void removeSaldo(double remove) {
        saldoDaConta -= remove;
        if (saldoDaConta < 0) {
            System.out.println("O sr está nos devendo:"+ saldoDaConta);;
        }
        else if (saldoDaConta > 0) {
            verSaldoDaConta();
        }
    }

    public void opcoes() {
        System.out.println("1) Ver saldo em conta");
        System.out.println("2) Adcionar saldo a conta");
        System.out.println("3) Retira todo saldo da conta");
        System.out.println("4) Retira um certo valor da conta");
        System.out.println("5) Sair");
    }

    public void condicoes() {
        if (this.escolha == 1){
            verSaldoDaConta();
        }
        else if (escolha == 3) {
            removeSaldo(saldoDaConta);
            System.out.println("Sacando todo o dinheiro disponivel");
        }
    }
}
