import java.util.*;
class Account
{
    private int accountNumber;
    private String accountHolderName;
    private double accountBalance;
    private String mobileNumber;
    public Account(int accountNumber, String accountHolderName, double accountBalance, String mobileNumber)
    {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
        this.mobileNumber = mobileNumber;
    }
    public void displayDetails()
    {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Balance: " + accountBalance);
        System.out.println("Mobile Number: " + mobileNumber);
    }
    public void deposit(double amount)
    {
        if (amount > 0)
        {
            accountBalance += amount;
            System.out.println("Deposited: Rs." + amount);
        }
        else
        {
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdraw(double amount)
    {
        if (amount > 0 && amount <= accountBalance)
        {
            accountBalance -= amount;
            System.out.println("Withdrawn: Rs." + amount);
        }
        else if (amount > accountBalance)
        {
            System.out.println("Insufficient balance.");
        }
        else
        {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
    public void changeMobileNumber(String newMobileNumber)
    {
        mobileNumber = newMobileNumber;
        System.out.println("Mobile number updated to: " + mobileNumber);
    }
    public void displayBalance()
    {
        System.out.println("Updated Account Balance: Rs." + accountBalance);
    }
    public void displayMobileNumber()
    {
        System.out.println("Updated Mobile Number: " + mobileNumber);
    }
}
public class program12
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the account number: ");
        int accno = sc.nextInt();
        System.out.println("Enter the account holder name: ");
        String name = sc.next();
        System.out.println("Enter the account balance: ");
        double balance = sc.nextDouble();
        System.out.println("Enter the mobile number: ");
        String mobile = sc.next();
        Account account1 = new Account(accno, name, balance, mobile);
        account1.displayDetails();
        account1.deposit(5000);
        account1.displayBalance();
        account1.withdraw(3000);
        account1.displayBalance();
        account1.changeMobileNumber("9999999999");
        account1.displayMobileNumber();
        account1.deposit(-1000);
        account1.withdraw(-1000);
        account1.withdraw(10000);
        System.out.println("\nEnter the account number for Account 2: ");
        int accno2 = sc.nextInt();
        System.out.println("Enter the account holder name for Account 2: ");
        String name2 = sc.next();
        System.out.println("Enter the account balance for Account 2: ");
        double balance2 = sc.nextDouble();
        System.out.println("Enter the mobile number for Account 2: ");
        String mobile2 = sc.next();
        Account account2 = new Account(accno2, name2, balance2, mobile2);
        account2.displayDetails();
        account2.deposit(10000);
        account2.withdraw(5000);
        account2.displayDetails();
    }
}