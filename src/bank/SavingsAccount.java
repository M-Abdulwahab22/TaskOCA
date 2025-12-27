package bank;

public class SavingsAccount extends BankAccount{

    public double interestRate;

    public void setAccountBalance(double accountBalance)
    {
        this.balance = accountBalance;
    }

    public void setInterestRate(double interestRate)
    {
        this.interestRate = interestRate/ 100;
    }

    @Override
    public void displayAccountInfo()
    {
        super.displayAccountInfo();
        System.out.println("interest rate on account : " + this.interestRate);
    }

    @Override
    public void applyMonthlyUpdate()
    {
        this.balance = this.balance + (this.balance * this.interestRate);
    }


}
