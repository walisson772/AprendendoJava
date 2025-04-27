package arquivos.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args){

        String path = "CHANGE-ME";
        Map<String, Integer> map = new LinkedHashMap<>();

        try (BufferedReader bf = new BufferedReader(new FileReader(path))){
            String linha = bf.readLine();

            while (linha != null){
                String[] fields = linha.split(",");
                String nome = fields[0];
                int qtd = Integer.parseInt(fields[1]);
                map.put(nome, qtd);
            }

            System.out.println("All:");
            for (String key : map.keySet()){
                System.out.println(key + " value: " + map.get(key));
            }
        }

        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
