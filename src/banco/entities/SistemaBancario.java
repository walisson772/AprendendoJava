package banco.entities;

public class SistemaBancario {

    private String nome;
    private int numeroConta;
    private double saldoConta;
    private char escolha;
    private final double taxa = 5.00;

    public SistemaBancario (String nome, int numeroConta, char escolha){
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.escolha = escolha;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double deposito) {
        this.saldoConta = deposito;
    }

    public void deposito(double deposito) {
        this.saldoConta += deposito;
    }

    public double retirada(double retirada) {
       return this.saldoConta = (this.saldoConta - retirada) - taxa ;
    }
}
