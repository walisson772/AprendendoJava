package herancapoliforfismo.aplication;

import herancapoliforfismo.entities.Account;
import herancapoliforfismo.entities.BusinessAcount;
import herancapoliforfismo.entities.SavingAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.DoubleAccumulator;

public class Heranca01 {
    public static void main(String[] args) {

        List<Account> list = new ArrayList<>();

        list.add(new SavingAccount(11, "Alex", 1000.0, 0.01));
        list.add(new BusinessAcount(22, "Nois", 1000.0, 200.0));
        list.add(new SavingAccount(33, "Aleq", 1000.0, 0.01));
        list.add(new BusinessAcount(44, "Tu", 1000.0, 300.0));

        double sum = 0;
        for (Account acc : list){
            sum += acc.getBalance();
        }
        System.out.printf("Total %.2f%n",sum);

        for (Account acc : list){
            acc.deposit(10);
        }
        for (Account acc : list){
            System.out.println(acc.getBalance());
        }
    }
}
