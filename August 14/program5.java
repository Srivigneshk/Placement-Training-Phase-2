class AccInfo{
    private String accountNumber;
    private String accountHolderName;
    private String mobileNumber;
    private String accountType;
    private double balance;
    public AccInfo(String accountNumber, String accountHolderName, String mobileNumber, String accountType, double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.mobileNumber = mobileNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    void getAccountNumber(){
        System.out.println("Account Number: " + accountNumber);
    }
    void getAccountHolderName(){
        System.out.println("Account Holder Name: " + accountHolderName);
    }
    void getMobileNumber(){
        System.out.println("Mobile Number: " + mobileNumber);
    }
    void getAccountType(){
        System.out.println("Account Type: " + accountType);
    }
    void getBalance(){
        System.out.println("Account Balance: " + balance);
    }

}
public class program5 {
    void main(String[] args){
        AccInfo acc1 = new AccInfo("1234567890", "John Doe", "9876543210", "Savings", 5000.0);
        acc1.getAccountNumber();
        acc1.getAccountHolderName();
        acc1.getMobileNumber();
        acc1.getAccountType();
        acc1.getBalance();
    }
}
