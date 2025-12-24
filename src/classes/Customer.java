package classes;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int customerId;
    private String name;
    private List<BankAccount> accounts;

    public Customer(String name)
    {
        AccountNumberGenerator.customerId++;
        this.customerId = AccountNumberGenerator.customerId;
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public Customer(String name, int customerId)
    {
        this(name);
        this.customerId = customerId;
    }

    public void addNewAccount(BankAccount newAccount)
    {
        this.accounts.add(newAccount);

    }

//    public BankAccount getAccountByAccountNumber(int accountNumber)
//    {
//        BankAccount a = new BankAccount();
//        return a;
//    }

    public void displayCustomerDetails(int customerId)
    {

    }



}
