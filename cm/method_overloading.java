import java.util.Scanner;

class teaching
{
    void DSA()
    {
        System.out.println("Data structures and algorithm");
    }
    void DSA(int a)
    {
        System.out.println(a);
    }
    void DSA(char a)
    {
        System.out.println(a);
    }
    void DSA(int a ,char b)
    {
        System.out.println(a+" "+b);
    }
    void DSA(int a ,char b,String str)
    {

    }
}
public class method_overloading {
    static void main() {
        teaching t =new teaching();

        Scanner input = new Scanner(System.in);

        t.DSA(10,'s',"string");


    }
}
