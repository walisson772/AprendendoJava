package pagamentos.entities;

public class Pagamentos {

    public String nome;
    public double salarioBruto;
    public double taxa;

    public double salarioLiquido(){
        return salarioBruto - taxa;
    }

    public void aumentoSalario(double porcentagem) {
        double aumento = salarioBruto * (porcentagem / 100);
        double novoSalario = salarioLiquido() + aumento;
        System.out.printf("Salario atual do funcionario: %s é R$ %.2f", nome, novoSalario);
    }
}
