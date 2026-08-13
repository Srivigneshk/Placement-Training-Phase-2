class division{
    void divide(int a, int b) throws RuntimeException{
        try{
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}
public class program10 {
    public static void main(String[] args) {
        division d = new division();
        d.divide(10, 2); 
        d.divide(10, 0);    
    }
}
