class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super("Error: " + message);
    }
}
class Bankaccount {
    private double balance;

    public Bankaccount(double initialBalance) {
        this.balance = initialBalance;
    }

    void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            throw new InsufficientFundsException(
                "Insufficient funds. Current balance: " + balance
            );
        }
    }

    double getBalance() {
        return balance;
    }
}
public class program11 {
    public static void main(String[] args) {
        Bankaccount account = new Bankaccount(4000);

        try {
            account.withdraw(5000);   
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}