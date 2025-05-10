package biblioteca.aplication;

import biblioteca.entities.Biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        List<Biblioteca> livros = new ArrayList<>();
        Biblioteca biblioteca = new Biblioteca();
        Scanner sc = new Scanner(System.in);

        int escolha;

        while (true){
            biblioteca.op();
            escolha = sc.nextInt();

            if (escolha == 1){
                System.out.print("Escolha um id unico para esse livro: ");
                int id = sc.nextInt();
                Biblioteca verificarId = livros.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
                if (verificarId != null){
                    System.out.println("Já tem um livro cadastrado com esse id.");
                }
                else {
                    System.out.print("Titulo: ");
                    sc.nextLine();
                    String titulo = sc.nextLine();
                    System.out.print("Autor: ");
                    String autor = sc.nextLine();
                    System.out.print("Ano de publicação: ");
                    int anoPublicacao = sc.nextInt();
                    livros.add(new Biblioteca(id, titulo, autor, anoPublicacao));
                    System.out.println("Livro cadastrado com sucesso.");
                }
            }

            else if (escolha == 2){
                Biblioteca verificarStatus = livros.stream().filter(x -> x.getDisponivel() == true).findFirst().orElse(null);
                if (verificarStatus != null){
                    verificarStatus.listarLivros(livros);
                }
            }

            else if (escolha == 3){
                Biblioteca verificarStatus = livros.stream().filter(x -> x.getDisponivel() == true).findFirst().orElse(null);
                if (verificarStatus == null){
                    System.out.println("");
                }
                verificarStatus.listarLivros(livros);
                System.out.print("Digite o id do livro que você deseja: ");
                int id = sc.nextInt();
                Biblioteca verificandoId = livros.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
                if (verificandoId == null){
                    System.out.println("Id invalido");
                }
                else {
                    livros.remove(verificandoId);
                }
            }

            else if (escolha == 5) {
                sc.close();
                break;
            }
        }
    }
}
