import java.util.*;
public class program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            if (b == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }
            System.out.println("Result: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
