package condicionais;

import java.util.Scanner;

public class exercicio004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String dia;
        switch (x) {
            case 1:
                dia = "domingo";
                break;
            case 2:
                dia = "segunda";
                break;
            case 3:
                dia = "terça-feira";
                break;
            case 4:
                dia = "quarta-feira";
                break;
            case 5:
                dia = "quinta-feira";
                break;
            case 6:
                dia = "sexta-feira";
                break;
            case 7:
                dia = "sabado";
                break;
            default:
                dia = "Valor invalido";
                break;
        }
        System.out.printf("Dia da semana: %s%n", dia);
        sc.close();
    }
}

