import java.util.Scanner;
class passwordvalidException extends Exception {
    public passwordvalidException(String message) {
        super(message);
    }
}
class PasswordValidator {
    public static void validatePassword(String password) throws passwordvalidException {
        if (password.length() < 8) {
            throw new passwordvalidException("least 8 characters long.");
        }
        if (!password.matches(".*[A-Z].*")) {
            throw new passwordvalidException("least one uppercase letter.");
        }
        if (!password.matches(".*[a-z].*")) {
            throw new passwordvalidException("least one lowercase letter.");
        }
        if (!password.matches(".*\\d.*")) {
            throw new passwordvalidException(" least one digit.");
        }
        if (!password.matches(".*[!@#$%^&*()].*")) {
            throw new passwordvalidException("least one special character (!@#$%^&*()).");
        }
    }
}
public class program13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();
        try {
            PasswordValidator.validatePassword(password);
            System.out.println("Password is valid.");
        } catch (passwordvalidException e) {
            System.out.println("Invalid password: " + e.getMessage());
        }
    }
}