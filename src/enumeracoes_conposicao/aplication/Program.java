package enumeracoes_conposicao.aplication;

import enumeracoes_conposicao.entites.Department;
import enumeracoes_conposicao.entites.HourContrat;
import enumeracoes_conposicao.entites.Worker;
import enumeracoes_conposicao.entities.enums.WorkLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Digite o nome do departamento: ");
        String departamentName = sc.nextLine();
        System.out.println("Entre com os dados do trabalhador:");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();
        Worker worker = new Worker(workerName, WorkLevel.valueOf(workerLevel), baseSalary, new Department(departamentName));

        System.out.print("Quantos contratos esse trabalhador vai ter: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            System.out.println("Entre com os dados do #"+i+" contrato: ");
            System.out.print("Data (dd/MM/yyyy): ");
            Date contractDate = fmt.parse(sc.next());
            System.out.print("valor por hora: ");
            double valueHour = sc.nextDouble();
            System.out.print("Duração do contrato: ");
            int hours = sc.nextInt();
            HourContrat contrat = new HourContrat(contractDate, valueHour, hours);
            worker.addContract(contrat);
        }

        System.out.println();
        System.out.print("Entre com mes e ano para calcular o salario (MM/yyyy): ");
        String monthYaer = sc.next();
        int month = Integer.parseInt(monthYaer.substring(0, 2));
        int year = Integer.parseInt(monthYaer.substring(3));
        System.out.println("Nome: "+worker.getName());
        System.out.println("Departamento: "+worker.getDepartment().getName());
        System.out.println("Renda :"+monthYaer+ ": "+String.format("%.2f",worker.income(year, month)));

        sc.close();
    }
}
