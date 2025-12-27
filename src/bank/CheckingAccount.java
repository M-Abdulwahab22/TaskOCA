package bank;

public class CheckingAccount extends BankAccount{

    public double monthlyFee;

    public void setAccountBalance(double accountBalance)
    {
        this.balance = accountBalance;
    }

    public void setMonthlyFee(double monthlyFee)
    {
        this.monthlyFee = monthlyFee;
    }

    @Override
    public void applyMonthlyUpdate()
    {
        withdraw(this.monthlyFee);
    }

    @Override
    public boolean withdraw(double amount)
    {
        double temp = this.balance - amount;
        if(temp < -500)
        {
            System.out.println("overfraft limit reached");
            return false;
        }

        this.balance -= amount;
        return true;



    }

    @Override
    public void displayAccountInfo()
    {
        super.displayAccountInfo();
        System.out.println("monthly fee on account : " + this.monthlyFee);
    }
}
