package controledeestoque.aplication;

import controledeestoque.util.ControleDeEstoque;
import controledeestoque.util.ControleDeProdutos;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Loja {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        List<ControleDeProdutos> list = new ArrayList<>();
        ControleDeProdutos estoc = new ControleDeProdutos();
        Scanner sc = new Scanner(System.in);


        while (true){
            estoc.opcoes();
            System.out.print("O que deseja fazer: ");
            int escolha = sc.nextInt();
            switch (escolha){
                case 1:
                    System.out.print("Digite o codigo do produto: ");
                    int codigo = sc.nextInt();

                    //Verifica se o codigo ja existe, se o codigo ja existir ele vai para o else.
                    ControleDeProdutos codigoFalse = list.stream().filter(x -> x.getCodigo() == codigo).findFirst().orElse(null);
                    if (codigoFalse == null){
                        System.out.print("Digite a quantidade de unidades: ");
                        int quantidade = sc.nextInt();
                        System.out.print("Digite o nome do produto: ");
                        sc.nextLine();
                        String produto = sc.nextLine();
                        System.out.print("Valor cobrado por cada unidade: ");
                        double preco = sc.nextDouble();
                        estoc.setValorUnidade(preco);
                        System.out.println("Produto: "+produto+" foi adcionado com sucesso.");
                        Double valorTotal = quantidade * preco;
                        list.add(new ControleDeProdutos(codigo, quantidade, produto, valorTotal, preco));
                    }

                    else{
                        System.out.println("Já tem um produto cadastrado com esse codigo.");
                    }
                    break;

                case 2:
                    if (list.isEmpty()){
                        System.out.println("Nenhum produto no estoque.");
                    }
                    else{
                        System.out.println("Produtos no estoque:");
                        for (ControleDeProdutos produtos : list){
                            System.out.println(produtos);
                        }
                    }
                    break;

                case 3:
                    for (ControleDeEstoque produtos : list){
                        System.out.println(produtos);
                    }

                    System.out.print("Digite codigo do produto: ");
                    int id = sc.nextInt();

                    // Verifica se o id(codigo) ja existe no estoque, se ele ja existir ele vai para o else;
                    ControleDeProdutos result = list.stream().filter(x -> x.getCodigo() == id).findFirst().orElse(null);

                    if (result == null){
                        System.out.println("Esse protudo não tem no estoque.");
                    }

                    else {
                        System.out.print("Digite a quantidade de unidade para remoção: ");
                        int qtd = sc.nextInt();
                        double menosValorInEstoque = result.getPrecoTotal() - qtd * estoc.getValorUnidade();
                        result.setPrecoTotal(menosValorInEstoque);
                        int unidade = result.getQuantidade() - qtd;
                        if (unidade <= 0){
                            System.out.println("Todas as unidade foram removidas");
                            list.remove(result);
                        }

                        else {
                            System.out.println("Foram removidos "+qtd+ " unidade do "+result.getNomeProduto());
                            result.setQuantidade(unidade);
                        }
                    }
                    break;

                case 4:
                    if (list.isEmpty()){
                        System.out.println("Nenhum produto no estoque.");
                    }
                    else{
                        for (ControleDeEstoque produtos : list){
                            System.out.println(produtos);
                        }
                        System.out.print("Digite o codigo do produto para novas atualizações: ");
                        int addUnidades = sc.nextInt();
                        ControleDeProdutos add = list.stream().filter(x -> x.getCodigo() == addUnidades).findFirst().orElse(null);
                        if (add == null){
                            System.out.println("Codigo invalido.");
                        }else{
                            System.out.print("Quantas unidades seram adicionadas: ");
                            int newUnidades = sc.nextInt();
                            add.novasUnidades(newUnidades);
                            System.out.println("Produto atualizado: ");
                            System.out.println(add);
                        }
                    }
                    break;

                case 5:
                    sc.close();
                    break;

                default:
                    System.out.println("Essa opção não existe.");
            }
        }
    }
}
