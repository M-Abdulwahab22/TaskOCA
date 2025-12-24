package classes;
import java.util.Scanner;

public class BankApplication {

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
//                    openBankAccount(scanner);
//                    break;
                case 3:
//                    depositMoney(scanner);
//                    break;
                case 4:
//                    withdrawMoney(scanner);
//                    break;
                case 5:
//                    displayAccountDetails(scanner);
//                    break;
                case 6:
//                    applyMonthlyProcessing(scanner);
//                    break;
                case 7:
//                    displayAllCustomers(scanner);
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
            if(scanner.hasNext()) {
                name = scanner.nextLine();
                if(!(name.trim().isEmpty()))
                {
                    break;

                }else{
                    System.out.println("Please Enter a name!");
                }
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
            if(scanner.hasNext()) {
                name = scanner.nextLine();
                if(!(name.trim().isEmpty()))
                {
                    break;

                }else{
                    System.out.println("Please Enter a name!");
                }
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
        CheckingAccount newCheckingAccount = new CheckingAccount();
        newCustomer.addNewAccount(newCheckingAccount);
        newCheckingAccount.setAccountBalance(balance);
        newCheckingAccount.setMonthlyFee(monthlyFee);
        System.out.println(name + " Checking Account Has been created successfully with starting balance = " +  balance);

    }

    public void runApplication()
    {
        this.mainMenu();
    }

}
