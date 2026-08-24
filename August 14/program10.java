class Account{
    static String bankName = "Mariamman Indian Bank";
    void displayAccountDetails(int accNo, String name, long MobileNo, String accType, double balance){
        System.out.println("Account Holder Name: " + name);
        System.out.println("Account Number: " + accNo);
        System.out.println("Mobile Number: " + MobileNo);
        System.out.println("Account Type: " + accType);
        System.out.println("Account Balance: " + balance);
    }      
}
public class program10 {
    public static void main(String[] args) {
        Account account = new Account();
        System.out.println("========================================");
        System.out.println("Mariamman Indian Bank");
        System.out.println("========================================");
        account.displayAccountDetails(12345, "John Doe", 9876543210L, "Savings", 10000.0);
    }
}
