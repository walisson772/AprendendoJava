package boxing_unboxing;

public class Boxing {
    public static void main(String[] args){

        int x = 20;

        Object obj = x;
        System.out.println(obj);

        int y = (int) obj;
        System.out.println(y);
    }
}
