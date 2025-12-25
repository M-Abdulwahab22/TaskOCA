package classes;

public class SavingsAccount extends BankAccount{
    //interset is added during monthly proccessing.
    //no overdraft is allowed.
    public double interestRate;

    public void setAccountBalance(double accountBalance)
    {
        this.balance = accountBalance;
    }
    public void setInterestRate(double interestRate)
    {
        this.interestRate = interestRate/ 100;
    }

    public void displayAccountInfo()
    {
        super.displayAccountInfo();
        System.out.println("interest rate on account : " + this.interestRate);
    }

    public void applyMonthlyUpdate()
    {
        
    }


}
