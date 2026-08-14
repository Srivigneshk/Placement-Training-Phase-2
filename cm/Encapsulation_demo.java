class me_personal
{
    int age ;
    String name;
    String work;
   private long savings;
   private void behaviour()
    {
        System.out.println("calm and angry");
    }
    public void show()  // void show() also possible
    {
        behaviour();
    }

}
public class Encapsulation_demo {
    static void main() {
       me_personal m =new me_personal();
       m.show();

    }
}
