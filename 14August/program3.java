import java.util.*;
class account{
    Scanner sc = new Scanner(System.in);
    private int accountNumber;
    private String accountHolderName;
    private String mobileNumber;
    private String accountType;
    private double balance;

    void getDetails(){
        System.out.println("Enter Account Holder Name: ");
        accountHolderName = sc.nextLine();
        System.out.println("Enter Account Number: ");
        accountNumber = sc.nextInt();
        System.out.println("Enter Mobile Number: ");
        mobileNumber = sc.next();
        System.out.println("Enter Account Type: ");
        accountType = sc.next();
        System.out.println("Enter Account Balance: ");
        balance = sc.nextDouble();
    }
    void displayDetails(){
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Balance: " + balance);
    }
    void balanceCheck(){
        if(balance < 1000){
            System.out.println("Your account balance is below the minimum required balance of 1000.");
        } else {
            System.out.println("Your account balance is sufficient.");
        }
    }

}
public class program3 {
    public static void main(String[] args){
        account a1 = new account();
        a1.getDetails();
        a1.displayDetails();
        a1.balanceCheck();
        account a2 = new account();
        a2.getDetails();
        a2.displayDetails();
        a2.balanceCheck();
    }       
}