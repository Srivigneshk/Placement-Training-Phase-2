import java.util.Scanner;
public class program12 {
    class InvalidMarkException extends Exception {
        public InvalidMarkException(String message) {
            super("Error: " + message);
        }
    }
    void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student's Marks: ");
        int[] marks = new int[5];
        System.out.println("Enter the marks :");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }
        for (int mark : marks) {
            try {
                if (mark < 0 || mark > 100) {
                    throw new InvalidMarkException("Invalid mark: " + mark);
                } else {
                    float avg = 0;
                    for (int m : marks) {
                        avg += m;
                    }
                    avg /= marks.length;
                    System.out.println("Average : " + avg);
                }
            } catch (InvalidMarkException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
