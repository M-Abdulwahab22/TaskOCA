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

    private void mainMenu()
    {
        Scanner scanner = new Scanner(System.in);
        int input = 0;

        while(true)
        {

            displayMainMenu();

            if(scanner.hasNextInt()){
                input = scanner.nextInt();
                scanner.nextLine();

                switch (input)
                {
                case 1:
                    createNewCustomer(scanner);
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

    private void createNewCustomer(Scanner scanner)
    {

    }

    public void runApplication()
    {
        this.mainMenu();
    }

}
