package enumeracoes_conposicao.entites;

import enumeracoes_conposicao.entities.enums.WorkLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {

    private String name;
    private WorkLevel level;
    private Double baseSalary;

    private Department department;
    private List<HourContrat> contrats = new ArrayList<>();

    public Worker(){}

    public Worker (String name, WorkLevel level, Double baseSalary, Department department){
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkLevel getLevel() {
        return level;
    }

    public void setLevel(WorkLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContrat> getContrats() {
        return contrats;
    }

    public void setContrats(List<HourContrat> contrats) {
        this.contrats = contrats;
    }

    public void addContract(HourContrat contrat){
        contrats.add(contrat);
    }
    public void removeContract(HourContrat contrat){
        contrats.remove(contrat);
    }
    public double income(int yaer, int month){
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for (HourContrat c : contrats){
            cal.setTime(c.getDate());
            int c_yaer = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);
            if (yaer == c_yaer && month == c_month){
                sum += c.totalValue();
            }
        }
        return sum;
    }
}
