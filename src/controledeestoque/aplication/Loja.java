package controledeestoque.aplication;

import controledeestoque.util.ControleDeEstoque;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Loja {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        List<ControleDeEstoque> list = new ArrayList<>();
        ControleDeEstoque estoc = new ControleDeEstoque();
        Scanner sc = new Scanner(System.in);
        int escolha;

        while (true){
            estoc.opcoes();
            System.out.print("O que deseja fazer: ");
            escolha = sc.nextInt();
            switch (escolha){
                case 1:
                    System.out.print("Digite o codigo do produto: ");
                    int codigo = sc.nextInt();

                    //Verifica se o codigo ja existe, se o codigo ja existir ele vai para o else.
                    ControleDeEstoque codigoFalse = list.stream().filter(x -> x.getCodigo() == codigo).findFirst().orElse(null);
                    if (codigoFalse == null){
                        System.out.print("Digite a quantidade de unidades: ");
                        int quantidade = sc.nextInt();
                        System.out.print("Digite o nome do produto: ");
                        sc.nextLine();
                        String produto = sc.nextLine();
                        System.out.print("Valor cobrado por cada unidade: ");
                        double preco = sc.nextDouble();
                        estoc.setValorUnidade(preco);
                        System.out.println(estoc.getValorUnidade());
                        System.out.println("Produto: "+produto+" foi adcionado com sucesso.");
                        Double valorTotal = quantidade * preco;
                        list.add(new ControleDeEstoque(codigo, quantidade, produto, valorTotal));
                    }
                    else{
                        System.out.println("Já tem um produto cadastrado com esse codigo.");
                    }
                    break;

                case 2:
                    System.out.println("Produtos no estoque:");
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
                        Double menosValorInEstoque = result.getPrecoTotal() - qtd * estoc.getValorUnidade();
                        result.setPrecoTotal(menosValorInEstoque);
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
