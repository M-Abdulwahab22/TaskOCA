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

    }

//    public void withdraw(double amount)
//    {
//
//    }
}
