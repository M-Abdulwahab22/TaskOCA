package classes;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int customerId;
    private String name;
    private List<BankAccount> accounts;

    public Customer(String name)
    {
        this.name = name;
        this.accounts = new ArrayList<>();
        this.customerId = ++AccountNumberGenerator.customerId;
    }

    public Customer(String name, int customerId)
    {
        this(name);
        this.customerId = customerId;
    }

    public String getName()
    {
        return this.name;
    }

    public int getCustomerId()
    {
        return this.customerId;
    }

    public List<BankAccount> getCustomerAccounts()
    {
        return this.accounts;
    }

    public void addNewAccount(BankAccount newAccount)
    {
        this.accounts.add(newAccount);

    }

    public BankAccount getAccountByAccountNumber(String accountNumber)
    {
       for(BankAccount acc : accounts)
       {
           if(acc.accountNumber.equalsIgnoreCase(accountNumber))
           {
               return acc;
           }
       }
       return null;
    }

    public void displayCustomerDetails(int customerId)
    {
        System.out.println("customer id : " + customerId);
        System.out.println("name : " + this.name);

        System.out.println(this.name + " Accounts : ");
        System.out.println("===============================");

        for(BankAccount acc : accounts)
        {
            acc.displayAccountInfo();
            System.out.println("___________________________");
        }
        System.out.println("===============================");
    }



}
