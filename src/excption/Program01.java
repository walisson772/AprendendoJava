package excption;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program01 {
    public static void main(String[] args){


    }

    public static void method2(){
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Posição invalida");
        }
        catch (InputMismatchException e){
            System.out.println("Input error");
        }
        System.out.println("Fim do programa");
        sc.close();
    }
}
