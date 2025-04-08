package systemempresa.entities;

public class FuncionarioTercerizado extends Funcionario{

    private Double custoAdiconal;

    public FuncionarioTercerizado(){
        super();
    }

    public FuncionarioTercerizado(String name, Integer hours, Double valuePerHours, Double custoAdiconal) {
        super(name, hours, valuePerHours);
        this.custoAdiconal = custoAdiconal;
    }

    public Double getCustoAdiconal() {
        return custoAdiconal;
    }

    public void setCustoAdiconal(Double custoAdiconal) {
        this.custoAdiconal = custoAdiconal;
    }

    @Override
    public Double payments(){
        return super.payments() + custoAdiconal * 1.1;
    }
}
