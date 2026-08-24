import java.util.Scanner;
class MariammanIndianBank{
    static String BankName = "Mariamman Indian Bank";
    void account(String name, long accountNumber, String accountType, double balance){
        System.out.println(BankName);
        System.out.println("Account Holder Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Balance: " + balance);
    }
}
public class program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Holder Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Account Number: ");
        long accountNumber = sc.nextLong();
        System.out.println("Enter Account Type: ");
        String accountType = sc.next();
        System.out.println("Enter Account Balance: ");
        double balance = sc.nextDouble();
        MariammanIndianBank bank = new MariammanIndianBank();
        bank.account(name, accountNumber, accountType, balance);
    }
}