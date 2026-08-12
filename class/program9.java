//Exception Handling
// bank - int balance , cons - withdraw(400)
import java.util.Scanner;
public class program9 {
    int balance = 1000;

    void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: ");
        int amt = sc.nextInt();
        try {
            withdraw(amt);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    void withdraw(int amount) throws Exception {
        if (amount > balance) {
            throw new Exception("Insufficient balance");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }
}
