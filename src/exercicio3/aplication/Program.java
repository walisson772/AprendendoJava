package exercicio3.aplication;

import exercicio3.model.entities.Funcoes;
import exercicio3.model.exceptions.ErrorException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Funcoes funcoes = new Funcoes();

        while (true){
            try{
                System.out.print("Digite um numero: ");
                double num1 = sc.nextInt();
                System.out.print("Digite outro numero: ");
                double num2 = sc.nextInt();
                funcoes.op();
                int escolha = sc.nextInt();
                Funcoes funcoes2 = new Funcoes(num1, num2, escolha);
                if (escolha == 5){
                    sc.close();
                    break;
                }
                System.out.println(funcoes2.verificarOperacao());
            }
            catch (ErrorException e){
                System.out.println(e.getMessage());
            }
        }


    }
}
