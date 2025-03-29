package controledeestoque.aplication;

import controledeestoque.util.ControleDeEstoque;

import javax.naming.ldap.Control;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Loja {
    public static void main(String[] args){
        List<ControleDeEstoque> list = new ArrayList<>();
        ControleDeEstoque estoc = new ControleDeEstoque();
        Scanner sc = new Scanner(System.in);
        int escolha = 0;

        while (true){
            estoc.opcoes();
            System.out.print("O que deseja fazer: ");
            escolha = sc.nextInt();
            switch (escolha){
                case 1:
                    System.out.print("Digite o dodigo do produto: ");
                    int codigo = sc.nextInt();
                    System.out.print("Digite a quantidade de unidades: ");
                    int quantidade = sc.nextInt();
                    System.out.print("Digite o nome do produto: ");
                    sc.nextLine();
                    String produto = sc.nextLine();
                    System.out.println("Produto: "+produto+" foi adcionado com sucesso.");
                    list.add(new ControleDeEstoque(codigo, quantidade, produto));
                    break;

                case 2:
                    System.out.println("Produtos no esque:");
                    for (ControleDeEstoque produtos : list){
                        System.out.println(produtos);
                    }
                    break;

                case 3:
                    for (ControleDeEstoque produtos : list){
                        System.out.println(produtos);
                    }
                    System.out.print("Digite codigo do produto: ");
                    int id = sc.nextInt();
                    ControleDeEstoque result = list.stream().filter(x -> x.getCodigo() == id).findFirst().orElse(null);
                    if (result == null){
                        System.out.println("Esse protudo não tem no estoque.");
                    }
                    else {
                        System.out.print("Digite a quantidade de unidade para remoção: ");
                        int qtd = sc.nextInt();
                        int unidade = result.getQuantidade() - qtd;
                        if (unidade < 0){
                            System.out.println("Todos as unidade foram removida");
                            list.remove(result);
                        }
                        else {
                            System.out.println("Foram removidos "+qtd+ " unidade do "+result.getNomeProduto());
                            result.setQuantidade(unidade);
                        }
                    }

                    break;
                case 4:
                    sc.close();
                    break;

                default:
                    System.out.println("Essa opção não existe.");
            }
        }

    }
}
