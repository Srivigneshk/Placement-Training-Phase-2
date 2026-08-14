public class exception_example {
    static void main() {
        System.out.println("Welcome to java program");
        int a=10,b=0;
        try
        {
             System.out.println(a/b);
        }catch (ArithmeticException e)
        {
            System.out.println("error");
        }
        finally
        {
            System.out.println("this is finally block");
        }



        System.out.println("end of the program");
    }
}
