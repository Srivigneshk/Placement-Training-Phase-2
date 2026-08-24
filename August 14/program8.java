class depositOP{
    private double balance = 25000;
    void deposit(double amount){
        if(amount<=0){
            System.out.println("Invalid amount");
        } else {
            balance += amount;
            System.out.println("Deposited: " + amount);
            System.out.println("New Balance: " + balance);
        }
    }

}
public class program8 {
    void main(String[] args) {
        depositOP d1 = new depositOP();
        d1.deposit(5000);
    }
}
