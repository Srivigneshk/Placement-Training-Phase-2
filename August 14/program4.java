import java.util.*;

class AccInfo{
    private String accountNumber;
    private String accountHolderName;
    private String mobileNumber;
    private String accountType;
    private double balance;

    void constructor(String accountNumber, String accountHolderName, String mobileNumber, String accountType, double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.mobileNumber = mobileNumber;
        this.accountType = accountType;
        this.balance = balance;
    }
    void displayDetails(){
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Balance: " + balance);
    }

}

public class program4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Holder Name: ");
        String accountHolderName = sc.nextLine();
        System.out.println("Enter Account Number: ");
        String accountNumber = sc.nextLine();
        System.out.println("Enter Mobile Number: ");
        String mobileNumber = sc.nextLine();
        System.out.println("Enter Account Type: ");
        String accountType = sc.nextLine();
        System.out.println("Enter Account Balance: ");
        double balance = sc.nextDouble();
        AccInfo acc1 = new AccInfo();
        acc1.constructor(accountNumber, accountHolderName, mobileNumber, accountType, balance);
        acc1.displayDetails();
        acc1.constructor("1234567890", "John Doe", "9876543210", "Savings", 5000.0);
        acc1.displayDetails();
        AccInfo acc2 = new AccInfo();
        acc2.constructor("0987654321", "Jane Smith", "8765432109", "Current", 10000.0);
        acc2.displayDetails();

    }
}