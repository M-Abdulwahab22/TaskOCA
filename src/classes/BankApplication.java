package classes;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankApplication {

    private List<Customer> allCustomers = new ArrayList<>();

    private void displayMainMenu()
    {
        System.out.println("Welcome to Smart Banking System");
        System.out.println("===============================");

        System.out.println("(1) Create New Customer");
        System.out.println("(2) Open Bank Account");
        System.out.println("(3) Deposit money");
        System.out.println("(4) Withdraw money");
        System.out.println("(5) Display Account Details");
        System.out.println("(6) Apply monthly processing");
        System.out.println("(7) Display all customers");
        System.out.println("(8) Exit");
        System.out.println("Choose an option : ");
    }

    private void displayCreatNewCustomerMenu()
    {
        System.out.println("Creating new customer screen");
        System.out.println("===============================");

        System.out.println("(1) Create Savings account");
        System.out.println("(2) Create Checkong account");
        System.out.println("(3) Exit");
        System.out.println("Choose an option : ");
    }

    private void mainMenu()
    {
        Scanner scanner = new Scanner(System.in);
        int input;

        while(true)
        {

            displayMainMenu();

            if(scanner.hasNextInt()){
                input = scanner.nextInt();
                scanner.nextLine();

                switch (input)
                {
                case 1:
                    createNewCustomer();
                    break;
                case 2:
                    openBankAccount();
                    break;
                case 3:
                    depositMoney();
                    break;
                case 4:
                    withdrawMoney();
                    break;
                case 5:
                    displayAccountDetails();
                    break;
                case 6:
//                    applyMonthlyProcessing();
//                    break;
                case 7:
//                    displayAllCustomers();
//                    break;
                case 8:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("invalid optioj!");
                    break;
                }
            }else{
                System.out.println("please enter a valid number!");
                scanner.nextLine();
            }

        }


    }

    //optio 1 create new customer.
    private void createNewCustomer()
    {
        Scanner scanner = new Scanner(System.in);
        int input;
        while(true)
        {
            displayCreatNewCustomerMenu();
            if(scanner.hasNextInt())
            {
                input = scanner.nextInt();
                scanner.nextLine();

                switch (input)
                {
                case 1 :
                    createSavingsAccount();
                    break;
                case 2:
                    createCheckingAccount();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("invalid option!");
                    break;
                }
            }else{
                System.out.println("please enter a valid number!");
                scanner.nextLine();
            }
        }



    }

    private void createSavingsAccount()
    {
        Scanner scanner = new Scanner(System.in);
        String name;
        double balance;
        double interestRate;

        while(true)
        {
            System.out.println("please enter customer name : ");

                name = scanner.nextLine();
                if(!(name.trim().isEmpty()))
                {
                    break;

                }else{
                    System.out.println("Please Enter a name!");

                }

        }
        while(true)
        {
            System.out.println("please enter customer balance : ");
            if(scanner.hasNextDouble()) {
                balance = scanner.nextDouble();
                scanner.nextLine();
                if (balance > 0) {
                    break;
                } else {
                    System.out.println("Balance have to be greater than 0.");
                }
            }else{
                System.out.println("please enter a valid number!");
                scanner.nextLine();
            }
        }

        while(true)
        {
            System.out.println("please enter customer interest rate : ");
            if(scanner.hasNextDouble()) {
                interestRate = scanner.nextDouble();
                scanner.nextLine();
                if (interestRate >= 0) {
                    break;
                } else {
                    System.out.println("interest have to be greater than 0.");
                }
            }else{
                System.out.println("please enter a valid interest rate!");
                scanner.nextLine();
            }
        }


        Customer newCustomer = new Customer(name);
        allCustomers.add(newCustomer);
        SavingsAccount newSavingsAccount = new SavingsAccount();
        newCustomer.addNewAccount(newSavingsAccount);
        newSavingsAccount.setAccountBalance(balance);
        newSavingsAccount.setInterestRate(interestRate);
        System.out.println(name + " Savings Account Has been created successfully with starting balance = " +  balance);

    }

    private void createCheckingAccount()
    {
        Scanner scanner = new Scanner(System.in);
        String name;
        double balance;
        double monthlyFee;

        while(true)
        {
            System.out.println("please enter customer name : ");

                name = scanner.nextLine();
                if(!(name.trim().isEmpty()))
                {
                    break;

                }else{
                    System.out.println("Please Enter a name!");
                }

        }
        while(true)
        {
            System.out.println("please enter customer balance : ");
            if(scanner.hasNextDouble()) {
                balance = scanner.nextDouble();
                scanner.nextLine();
                if (balance > 0) {
                    break;
                } else {
                    System.out.println("Balance have to be greater than 0.");
                }
            }else{
                System.out.println("please enter a valid number!");
                scanner.nextLine();
            }
        }

        while(true)
        {
            System.out.println("please enter customer monthly fee : ");
            if(scanner.hasNextDouble()) {
                monthlyFee = scanner.nextDouble();
                scanner.nextLine();
                if (monthlyFee >= 0) {
                    break;
                } else {
                    System.out.println("monthly fee have to be greater than 0.");
                }
            }else{
                System.out.println("please enter a valid monthly fee!");
                scanner.nextLine();
            }
        }


        Customer newCustomer = new Customer(name);
        allCustomers.add(newCustomer);
        CheckingAccount newCheckingAccount = new CheckingAccount();
        newCustomer.addNewAccount(newCheckingAccount);
        newCheckingAccount.setAccountBalance(balance);
        newCheckingAccount.setMonthlyFee(monthlyFee);
        System.out.println(name + " Checking Account Has been created successfully with starting balance = " +  balance);

    }


    //option 2 open bank account
    private void openBankAccount()
    {

    }


    //option 3 deposit money
    private void depositMoney() {
        Scanner scanner = new Scanner(System.in);
        String accNum;

        while (true) {
            System.out.println("enter account number you want to deposit to or -1 to exit screen : ");
            if (scanner.hasNext()) {
                accNum = scanner.nextLine();

                if (accNum.equals("-1")) {
                    return;
                }

                if (!(accNum.trim().isEmpty())) {
                    boolean found = false;
                    for (Customer c : allCustomers) {
                        BankAccount acc = c.getAccountByAccountNumber(accNum);
                        if (acc != null) {
                            acc.displayAccountInfo();
                            found = true;
                            while(true)
                            {
                                System.out.println("please enter amount you want to deposit : ");

                                try{
                                    if (scanner.hasNextLine()) {
                                        String input = scanner.nextLine();
                                        double amount = Double.parseDouble(input);
                                        if (amount > 0) {
                                            if(acc.deposit(amount)){
                                                System.out.println("amount deposited!");
                                                acc.displayAccountInfo();
                                                break;
                                            }else{
                                                System.out.println("failed to deposit");
                                            }

                                        } else {
                                            System.out.println("amount have to be greater than 0");
                                        }
                                    }

                                } catch (NumberFormatException e)
                                {
                                    System.out.println("enter correct format " + e.getMessage());
                                }

                            }

                        }


                    }
                    if (!found) {
                        System.out.println("account not found. try again please");
                    }


                }

            }
        }
    }

    //option 4 withdraw money
    private void withdrawMoney()
    {
        Scanner scanner = new Scanner(System.in);
        String accNum;

        while (true) {
            System.out.println("enter account number you want to withdraw to or -1 to exit screen : ");
            if (scanner.hasNext()) {
                accNum = scanner.nextLine();

                if (accNum.equals("-1")) {
                    return;
                }

                if (!(accNum.trim().isEmpty())) {
                    boolean found = false;
                    for (Customer c : allCustomers) {
                        BankAccount acc = c.getAccountByAccountNumber(accNum);
                        if (acc != null) {
                            acc.displayAccountInfo();
                            found = true;
                            while(true)
                            {
                                System.out.println("please enter amount you want to withdraw : ");
                                try {
                                    if (scanner.hasNextLine()) {
                                        String input = scanner.nextLine();
                                        double amount = Double.parseDouble(input);
                                        if (amount > 0) {
                                            if(acc.withdraw(amount)){
                                                System.out.println("amount withdraw!");
                                                acc.displayAccountInfo();
                                                break;
                                            }else{
                                                System.out.println("failed to withdraw");
                                            }

                                        }else {
                                            System.out.println("amount have to be greater than 0");
                                        }

                                    }

                                }catch(NumberFormatException e)
                                {
                                    System.out.println("enter correct format " + e.getMessage());

                                }
                            }

                        }


                    }
                    if (!found) {
                        System.out.println("account not found. try again please");
                    }


                }

            }
        }
    }


    //option 5 display account details
    private void displayAccountDetails()
    {
        Scanner scanner = new Scanner(System.in);
        String accNum;

        while(true)
        {
            System.out.println("please enter account number or -1 to exit screen: ");
            if(scanner.hasNext()) {
                accNum = scanner.nextLine();

                if(accNum.equals("-1"))
                {
                    return;
                }

                if(!(accNum.trim().isEmpty()))
                {
                    boolean found = false;
                    for(Customer c : allCustomers)
                    {
                        BankAccount acc = c.getAccountByAccountNumber(accNum);
                        if(acc != null)
                        {
                            acc.displayAccountInfo();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("account not found. try again please");
                    }

                }


            }

        }
    }

    public void runApplication()
    {
        this.mainMenu();
    }



}
