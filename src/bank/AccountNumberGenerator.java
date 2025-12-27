package bank;

public class AccountNumberGenerator {
    public static int customerId = 0;
    private static int accountNum = 1000;
    public static String generateUniqueId()
    {
        return String.valueOf(++accountNum);
    }
}
