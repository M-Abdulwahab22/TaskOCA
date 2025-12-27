package bank;

public abstract class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount()
    {
        this.accountNumber = AccountNumberGenerator.generateUniqueId();
    }
    public abstract void applyMonthlyUpdate();

    public String getAccountNumber()
    {
        return this.accountNumber;
    }
    public boolean deposit(double amount)
    {
        if(amount < 0)
        {
            System.out.println("amount have to be greater than 0");
            return false;
        }
        this.balance += amount;
        return true;
    }

    public boolean withdraw(double amount)
    {
        if(amount > this.balance)
        {
            System.out.println("amount is greater than balance current amount : " + this.balance);
            return false;
        }
        this.balance -= amount;
        return true;
    }

    public void displayAccountInfo()
    {
        System.out.println("Account number " + this.accountNumber);
        System.out.println("account type : " + this.getClass().getSimpleName() );
        System.out.println("balance : " + this.balance );
    }


}
