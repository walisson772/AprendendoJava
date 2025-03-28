package boxing_unboxing;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();

        list.add("Meu nome");
        list.add("nome");
        list.add("Meu");
        list.add(2, "walisson");

        for (String nome : list){
            System.out.println(nome);
        }
        System.out.println("-------------------");
        list.removeIf(x -> x.charAt(0) == 'M');

        for (String nome : list){
            System.out.println(nome);
        }
        System.out.println("-------------------");
        System.out.println("Index of walisson = "+ list.indexOf("walisson"));
        System.out.println("-------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'w').collect(Collectors.toList());

        for (String nome : result){
            System.out.println(nome);
        }
        System.out.println("-------------------");
        String nome = list.stream().filter(x -> x.charAt(0) == 'j').findFirst().orElse(null);
        System.out.println(nome);
    }
}
