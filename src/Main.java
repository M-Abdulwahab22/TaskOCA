import classes.BankApplication;
/*
* business rules:
* Amount must be greater than 0
* Savings account -> balance cannot go below 0
* Checking account -> balance cannot go below -500
* */

/*
* Input validation:
* Invalid numeric inputs must be rejected
* System must not crash*/

/*
* display requirments :
Account Number: 1001
Account Type  : Savings
Balance       : $1250.50
Interest Rate : 3.5%
* */

public class Main {
    public static void main(String[] args) {
        BankApplication application = new BankApplication();

        application.runApplication();

    }
}