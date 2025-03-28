package boxing_unboxing;

public class LacoForEach {
    public static void main(String[] args) {
        String[] vect = new String[] {"Maria", "Alex", "Fernando", "fernada"};

        for (int i=0; i<vect.length; i++){
            System.out.println(vect[i]);
        }

        for (String nomes : vect) {
            System.out.println(nomes);
        }
    }
}
