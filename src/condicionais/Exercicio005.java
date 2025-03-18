package condicionais;

public class Exercicio005 {
    public static void main(String[] args) {
        double preco = 35.0;
        double desconto;
        desconto = (preco < 20) ? preco * 0.1: preco * 0.5;
        System.out.println(desconto);
    }
}
