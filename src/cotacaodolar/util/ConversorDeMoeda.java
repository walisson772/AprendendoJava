package cotacaodolar.util;

public class ConversorDeMoeda {

    private static final double IOF = 6;

    public static double converter(double value, double dolars) {
        double qtdAPagar = value * dolars;
        double taxa = (qtdAPagar * IOF) / 100;
        return qtdAPagar + taxa;
    }
}
