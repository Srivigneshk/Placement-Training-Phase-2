class father
{
    int age = 56;
    String name = "my father";
    void father()
    {
        int income =20000;
        System.out.println("my father income "+income);
    }
}
class son extends father
{
    void son()
    {
        System.out.println("i am from son");
    }
}

class daughter extends father{

}

public class single_inheritance {
    static void main() {
       son obj = new son();
        System.out.println(obj.name);

        daughter d =new daughter();
        d.father();


    }
}
