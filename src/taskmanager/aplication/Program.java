package taskmanager.aplication;

import taskmanager.entities.Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Tasks> list = new ArrayList<>();
        Tasks admin = new Tasks();
        int escolha;
        int id = 0;

        while (true){
            admin.opcoes();
            System.out.print("O que deseja fazer: ");
            escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Adicione uma tarefa: ");
                    sc.nextLine();
                    String tarefa = sc.nextLine();
                    list.add(new Tasks(id, tarefa));
                    id += 1;
                    break;

                case 2:
                    System.out.println("-----------------------------");
                    System.out.println("Tarefas Pendentes:");
                    admin.listTarefas(list);
                    System.out.println("-----------------------------");
                    break;

                case 3:
                    System.out.println("-----------------------------");
                    System.out.println("Tarefas Pendentes:");
                    admin.listTarefas(list);
                    System.out.print("Digite o id da tarefa concluida: ");
                    Integer task = sc.nextInt();
                    Tasks result = list.stream().filter(x -> x.getId() == task).findFirst().orElse(null);

                    if (result == null){
                        System.out.println("Essa tarefa não existe");
                    }
                    else{
                        System.out.println("Tarefa: "+result+" foi removida");
                        list.remove(result);
                        System.out.println("-----------------------------");
                    }
                    break;

                case 4:
                    sc.close();
                    break;

                default:
                    System.out.println("Essa opção não existe");
            }
        }
    }
}
