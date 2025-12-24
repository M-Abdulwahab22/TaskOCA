package classes;

import java.util.List;

public class Customer {
    private int customerId;
    private String name;
    private List<BankAccount> accounts;

    public Customer(String name)
    {
        this.name = name;
    }

    public Customer(String name, int customerId)
    {
        this(name);
        this.customerId = customerId;
    }

    public void addNewAccount()
    {

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
