public class program5 {
    class BankAccount{
        void deposit(int amt){
            System.out.println("Deposit money in bank account" + amt);
        }
        void deposit(int amt, String description){
            System.out.println("Deposit money in bank account" + amt + " in bank " + description);
        }
        void deposit(int amt, String description, int id_no){
            System.out.println("Deposit money in bank account" + amt + " in bank " + description + " of bank name " + id_no);
        }
    }
    class savings extends BankAccount{
        void interest_calculation(int amt, double percentage){
            double interest = amt * percentage;
            System.out.println("Interest calculated for savings account: " + interest);
        }
    }
    class current extends BankAccount{
        void interest_calculation(int amt, double percentage){
            double interest = amt * percentage;
            System.out.println("Interest calculated for current account: " + interest);
        }
    }
    void main(String[] args){
        BankAccount b = new BankAccount();
        b.deposit(1000);
        b.deposit(2000, "Salary");
        b.deposit(3000, "Funds", 12345);
        
        savings s = new savings();
        s.interest_calculation(10000, 0.06);
        
        current c = new current();
        c.interest_calculation(20000, 0.02);
    }
}
