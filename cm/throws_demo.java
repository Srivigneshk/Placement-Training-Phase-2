class division
{
    void divide(int a,int b) throws RuntimeException
    {
        System.out.println(a/b);
    }
}
public class throws_demo {
    static void main() {
        division d =new division();
        d.divide(10,0);

        System.out.println("end of the program");
    }
}
