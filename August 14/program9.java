class WithdrawOP{
    private double balance = 15000;
    void withdraw(double amount){
        if(amount<=0){
            System.out.println("Invalid amount");
        } else if(amount>balance){
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("New Balance: " + balance);
        }
    }
}
public class program9 {
    void main(String[] args) {
        WithdrawOP w1 = new WithdrawOP();
        w1.withdraw(5000);
    }
}
