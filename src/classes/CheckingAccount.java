package classes;

public class CheckingAccount extends BankAccount{
    //monthly fee deducted during proccessing.
    //overdraft allowed up to -500.
/*
* When the user selects Apply Monthly Processing
Loop through all customers
Loop through all accounts
Call
applyMonthlyUpdate() polymorphically
* */

    //instance of is not allowed.

    public double monthlyFee;

    public void setAccountBalance(double accountBalance)
    {
        this.balance = accountBalance;
    }

    public void setMonthlyFee(double monthlyFee)
    {
        this.monthlyFee = monthlyFee;
    }

    public void applyMonthlyUpdate()
    {
        withdraw(this.monthlyFee);
    }

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

    public void displayAccountInfo()
    {
        super.displayAccountInfo();
        System.out.println("monthly fee on account : " + this.monthlyFee);
    }
}
