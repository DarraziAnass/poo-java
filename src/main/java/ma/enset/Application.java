package ma.enset;

import ma.enset.entities.CurrentAccount;
import ma.enset.entities.SavingAccount;
import ma.enset.exceptions.AccountNotFoundException;
import ma.enset.services.BankAccountService;
import ma.enset.services.BankAccountServiceImpl;


public class Application {

    public static void main(String[] args) {

        BankAccountService bankAccountService = new BankAccountServiceImpl();
        bankAccountService.addAccount(new CurrentAccount(2345,"MAD",3454));
        bankAccountService.addAccount(new SavingAccount(2345,"MAD",3.4));
        bankAccountService.addAccount(new CurrentAccount(12345,"MAD",1231));
        bankAccountService.getAllAccounts().get(0).setAccountId("CC1");

        bankAccountService.getAllAccounts().forEach(System.out::println);

        try {
            System.out.println(bankAccountService.getAccountById("CC2"));
        } catch (AccountNotFoundException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("----------- suite ------------");
    }

}
