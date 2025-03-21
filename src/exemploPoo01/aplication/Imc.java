package exemploPoo01.aplication;

public class Imc {
    public static String calcularImc(double altura, double peso) {
        double imc = peso / (altura * 2);
        String result;
        // Classificação do IMC
        if (imc < 18.5) {
            result = "Classificação: Abaixo do peso";
        } else if (imc < 24.9) {
            result = "Classificação: Peso normal";
        } else if (imc < 29.9) {
            result = "Classificação: Sobrepeso";
        } else if (imc < 34.9) {
            result = "Classificação: Obesidade grau I";
        } else if (imc < 39.9) {
            result = "Classificação: Obesidade grau II";
        } else {
            result = "Classificação: Obesidade grau III (mórbida)";
        }
        System.out.printf("Seu imc é: %.2f%n", imc);
        return result;
    }
}
