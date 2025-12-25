package classes;

public class AccountNumberGenerator {
    public static int customerId = 0;
    public static String generateUniqueId()
    {
        return "customer_"+customerId;
    }
}
