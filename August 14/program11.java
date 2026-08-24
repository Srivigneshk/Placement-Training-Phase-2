class BankAccount{
    static String bankName = "Mariamman Indian Bank";
    void accDetails(int accNo, String name, long MobileNo, String accType, double balance){
        System.out.println(bankName);
        System.out.println("Account Holder Name: " + name);
        System.out.println("Account Number: " + accNo);
        System.out.println("Mobile Number: " + MobileNo);
        System.out.println("Account Type: " + accType);
        System.out.println("Account Balance: " + balance);
    }
}
public class program11 {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        account1.accDetails(12345, "John Doe", 9876543210L, "Savings", 10000.0);
        account2.accDetails(67890, "Jane Smith", 9876543210L, "Current", 15000.0);
    }
}