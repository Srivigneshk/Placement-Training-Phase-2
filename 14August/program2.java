import java.util.*;
class AccDetails{
    String name;
    int accountNumber;
    long PhoneNumber;
    String accType;
    double balance;

    public void getDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Holder Name: ");
        name = sc.nextLine();
        System.out.println("Enter Account Number: ");
        accountNumber = sc.nextInt();
        System.out.println("Enter Phone Number: ");
        PhoneNumber = sc.nextLong();
        System.out.println("Enter Account Balance: ");
        balance = sc.nextDouble();
    }
    public void accType(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Type: ");
        accType = sc.nextLine();
    }

    public void displayDetails(){
        System.out.println("Account Holder Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Phone Number: " + PhoneNumber);
        System.out.println("Account Type: " + accType);
        System.out.println("Account Balance: " + balance);
    }
}
public class program2 {
    public static void main(String[] args){
        AccDetails acc = new AccDetails();
        acc.getDetails();
        acc.accType();
        acc.displayDetails();

    }    
}
