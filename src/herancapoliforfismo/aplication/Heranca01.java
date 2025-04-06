package herancapoliforfismo.aplication;

import herancapoliforfismo.entities.Account;
import herancapoliforfismo.entities.BusinessAcount;
import herancapoliforfismo.entities.SavingAccount;

public class Heranca01 {
    public static void main(String[] args){

        Account acc = new Account(11, "Walisson", 0.0);
        BusinessAcount bacc = new BusinessAcount(12, "Walisson22", 0.0, 1000.0);

        // UPCASTING

        Account acc1 = bacc;
        Account acc2 = new BusinessAcount(13, "eu", 0.0, 500.0);
        Account acc3 = new SavingAccount(14, "msm", 0.0, 3000.0);

        // DOWNCASTING

        BusinessAcount acc4 = (BusinessAcount) acc2;
        acc4.loan(1000);
        if (acc3 instanceof BusinessAcount){
            BusinessAcount acc5 = (BusinessAcount) acc3;
            acc5.loan(500);
            System.out.println("loan");
        }

        if (acc3 instanceof SavingAccount){
            SavingAccount acc5 = (SavingAccount) acc3;
            acc5.updateBalance();
            System.out.println("update");
        }
    }
}
