package herancapoliforfismo.aplication;

import herancapoliforfismo.entities.Account;
import herancapoliforfismo.entities.BusinessAcount;
import herancapoliforfismo.entities.SavingAccount;

public class Heranca01 {
    public static void main(String[] args) {
        Account acc1 = new Account(111, "Alex", 1000.0);
        acc1.saque(200);
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingAccount(112, "aa", 2000.0, 0.1);
        acc2.saque(200);
        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAcount(133, "WWW", 1000.0, 2000.0);
        acc3.saque(200);
        System.out.println(acc3.getBalance() );
    }
}
