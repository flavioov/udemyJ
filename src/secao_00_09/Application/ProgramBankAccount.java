package secao_00_09.Application;

import secao_00_09.Entities.BankAccount;
import Myclasses.KeyboarInput;

import java.util.Locale;

public class ProgramBankAccount {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        int accountNumber = KeyboarInput.readIntegerType("Enter account number: ");
        String accountHolder = KeyboarInput.readAString("Enter account holder: ");

        BankAccount clientAccount = KeyboarInput.readAString("Is there an initial deposit (y/n)? ").equals("n") ?
                new BankAccount(
                        accountNumber, accountHolder
                ) : new BankAccount(
                        accountNumber,
                        accountHolder,
                        KeyboarInput.readDoubleType("Enter initial deposit value: ")
                );

        System.out.println("\nAccount data: \n" + clientAccount);

        clientAccount.deposit(KeyboarInput.readDoubleType("\nEnter a deposit value: "));
        System.out.println("Updated account: \n" + clientAccount);

        clientAccount.withdraw(KeyboarInput.readDoubleType("\nEnter a withdraw value: "));
        System.out.println("Updated account: \n" + clientAccount);

    }
}
