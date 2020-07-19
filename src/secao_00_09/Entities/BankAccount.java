package secao_00_09.Entities;

public class BankAccount {
    private final int accountNumber;
    private String accountHolder;
    private double accountBalance;

    public BankAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public BankAccount(int accountNumber, String accountHolder, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        deposit(initialDeposit);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    private static final int withdrawTax = 5;

    public void withdraw(double valueTowithdraw) {
        accountBalance -=  (valueTowithdraw + withdrawTax);
    }

    public void deposit(double valueToDeposit) {
        accountBalance += valueToDeposit;
    }

    @Override
    public String toString() {
        return "Account "
                + getAccountNumber()
                + ", Holder: "
                + getAccountHolder() +
                ", Balance: $ "
                + String.format("%.2f", getAccountBalance());
    }
}
