package listcontacts.aplication;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import listcontacts.entities.GerentContacts;

public class Program {
    public static void main(String[] args){
        GerentContacts gerent = new GerentContacts();
        List<GerentContacts> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true){
            gerent.opcoes();
            System.out.print("Escolha alguma das opções acima: ");
            int escolha = sc.nextInt();
            switch (escolha){
                case 1:
                    System.out.print("Digite um id para pesquisar mais rapido por um contato: ");
                    int id = sc.nextInt();
                    GerentContacts idExiste = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
                    if (idExiste == null){
                        System.out.print("Digite o nome do contato: ");
                        sc.nextLine();
                        String nome = sc.nextLine();
                        System.out.print("Digite o numero do contato: ");
                        String num = sc.nextLine();
                        list.add(new GerentContacts(id, nome, num));
                        System.out.println(nome+" foi adcionado com sucesso.");
                    }else{
                        System.out.println("Ja tem um usuario com esse id");
                    }

                    break;

                case 2:
                    for (GerentContacts contatc : list){
                        System.out.println(contatc);
                    }
                    break;

                case 3:
                    System.out.print("Buscar um contato pelo id: ");
                    int buscarId = sc.nextInt();
                    GerentContacts user = list.stream().filter(x -> x.getId() == buscarId).findFirst().orElse(null);
                    if (user == null){
                        System.out.println("Não tem nenhum contato com id salvo.");
                    }else {
                        System.out.println(user);
                    }
                    break;

                case 4:
                    System.out.print("Digite um id para excluir o numero de telefone: ");
                    int idRemove = sc.nextInt();
                    list.removeIf(x -> x.getId() == idRemove);
                    break;

                case 5:
                    sc.close();
                    break;
                default:
                    System.out.println("Essa opção não existe");
                    break;
            }

        }

    }
}
