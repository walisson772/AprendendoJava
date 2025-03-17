import java.util.Locale;

public class exercicio001 {
    public static void main(String[] args) {
        String produto1 = "Computador";
        String produto2 = "Mesa de Escritorio";

        int idade = 30;
        int codigo = 5290;
        char genero = 'F';

        double preco1 = 2100.0;
        double preco2 = 650.0;
        double medida = 53.234567;

        System.out.println("Produtos:");
        System.out.printf("%s, tem o preço de $ %.2f%n", produto1, preco1);
        System.out.printf("%s, tem o preço de $ %.2f%n", produto2, preco2);
        System.out.printf("Registro: %d anos, código %d e genero %s%n", idade, codigo, genero);
        System.out.printf("Medida com 8 casas decimais: %.8f%n", medida);
        System.out.printf("Com 3 casas decimais: %.3f", medida);
        Locale.setDefault(Locale.US);
        System.out.printf("Ponto decimal dos EUA: %.3f%n", medida);
    }
}
