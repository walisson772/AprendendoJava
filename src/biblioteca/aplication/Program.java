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
                biblioteca.listarLivros(livros);
                System.out.print("Digite o id do livro que você deseja: ");
                int id = sc.nextInt();
                Biblioteca verificandoId = livros.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
                if (verificandoId == null){
                    System.out.println("Id invalido");
                }else {
                    if (verificandoId.getDisponivel() == true) {
                        System.out.println("Livro reservado com sucesso");
                        verificandoId.setDisponivel(false);
                    }else {
                        System.out.println("Esse livro ja esta reservado");
                    }
                }
            }

            else if (escolha == 3){
                biblioteca.listarLivros(livros);
                System.out.print("Digite o id do livro que você deseja devolver: ");
                int id = sc.nextInt();
                Biblioteca verificandoId = livros.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
                if (verificandoId == null){
                    System.out.println("Id invalido");
                }else {
                    verificandoId.setDisponivel(true);
                    System.out.println("A devolução foi feita com sucesso");
                }
            }

            else if (escolha == 4) {
                sc.close();
                break;
            }
        }
    }
}
