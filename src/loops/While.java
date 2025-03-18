package loops;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        int result = 0;
        int x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        while (x != 0) {
            result += x;
            x = sc.nextInt();
        }
        System.out.println(result);

        sc.close();

    }
}
