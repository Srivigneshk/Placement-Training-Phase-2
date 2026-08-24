import java.util.*;
class BankAcc{

    public String accName;
    private int accNum = 1007 ;
    private double balance = 1000;
    private String accType = "Savings";

    void getDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Holder Name: ");
        accName = sc.nextLine();
    }

    void displayAccDetails(String accName){
        System.out.println("Account Holder: " + accName);
        System.out.println("Account Number: " + accNum);
        System.out.println("Account Type: " + accType);
        System.out.println("Account Balance: " + balance);
    }

    void deposit(double amount){
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

}
public class program7 {
    void main(String[] args) {

        BankAcc a1 = new BankAcc();
        a1.getDetails();
        a1.displayAccDetails(a1.accName);
        a1.deposit(500);
        a1.withdraw(200);
        a1.displayAccDetails(a1.accName);
        
    }
}
