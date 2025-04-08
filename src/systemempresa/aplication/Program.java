package systemempresa.aplication;

import systemempresa.entities.Funcionario;
import systemempresa.entities.FuncionarioTercerizado;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionario> list = new ArrayList<>();

        System.out.print("Quantos funcionarios: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            System.out.println("Dados do funcionario #"+i+" :");
            System.out.print("O funcionario é tercerizado (s/n): ");
            char ch = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Horas: ");
            int horas = sc.nextInt();
            System.out.print("Valor por hora: ");
            double valorHora = sc.nextDouble();
            if (ch == 's'){
                System.out.print("Valor adicional: ");
                double valorAdicional = sc.nextDouble();
                list.add(new FuncionarioTercerizado(nome, horas, valorHora, valorAdicional));
            }else{
                list.add(new Funcionario(nome, horas, valorHora));
            }

        }
        System.out.println();
        System.out.println("PAGAMENTOS");
        for (Funcionario fun : list){
            System.out.println(fun.getName() + " - $"+ String.format("%.2f", fun.payments()));
        }


        sc.close();
    }
}
