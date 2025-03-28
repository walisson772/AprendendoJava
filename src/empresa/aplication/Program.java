package empresa.aplication;

import empresa.entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        List<Funcionario> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos funcionarios seram cadastrados: ");
        int n = sc.nextInt();
        for (int i=1; i<=n; i++){
            System.out.println("Funcionario #"+i+":");
            System.out.print("Digite o id: ");
            int id = sc.nextInt();
            while (hasId(list, id)){
                System.out.print("Já peguei esse id. Tente novamente");
                id = sc.nextInt();
            }
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Salario: ");
            double salario = sc.nextDouble();
            list.add(new Funcionario(id, nome, salario));
        }

        System.out.println();
        System.out.print("Digite o id do funcionario que vai receber o aumento: ");
        int id = sc.nextInt();
        Funcionario func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (func == null){
            System.out.println("Esse funcionario não foi cadastrado");
        }else{
            System.out.print("Quantos porcentos o funcionario vai receber de almento: ");
            double porcent = sc.nextDouble();
            func.upSalario(porcent);
        }
        for (Funcionario funcionarios : list){
            System.out.println(funcionarios);
        }
        sc.close();
    }
    public static boolean hasId(List<Funcionario> list,int id){
        Funcionario result = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return result != null;
    }
}

