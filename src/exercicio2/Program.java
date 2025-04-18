package exercicio2;

public class Program {
    public static void main(String[] args){
        int[] numeros = {22,31,13,24,75,86,71,13,69,19};
        int resultMaior = 0;

        for (int num : numeros){
            if (num > resultMaior){
                resultMaior = num;
            }
        }
        System.out.println("O maior numero é: "+resultMaior);
    }
}
