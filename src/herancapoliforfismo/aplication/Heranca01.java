package herancapoliforfismo.aplication;

import herancapoliforfismo.entities.Account;
import herancapoliforfismo.entities.SavingAccount;

public class Heranca01 {
    public static void main(String[] args) {

        Account x = new Account(1, "eu", 100.0);
        Account y = new SavingAccount(1, "Tu", 100.0, 0.01);

        x.saque(50);
        y.saque(50);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());
    }
}
