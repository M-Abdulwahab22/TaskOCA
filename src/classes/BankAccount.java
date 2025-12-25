package classes;

public abstract class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount()
    {
        this.accountNumber = AccountNumberGenerator.generateUniqueId();
    }
    public abstract void applyMonthlyUpdate();

    public void deposit(double amount)
    {

    }

    public void withdraw(double amount)
    {

    }

    public void displayAccountInfo()
    {
        System.out.println("balance : " + this.balance );
    }


}
