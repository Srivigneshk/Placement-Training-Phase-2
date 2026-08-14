class me
{
    private int age;
    private String name;

    public void setter(int age ,String name)
    {
        this.age = age;
        this.name = name;
    }
    public int getter()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }
}
public class getter_setter_demo {
    static void main() {
        me m =new me();



        m.setter(10,"aaaa");
        System.out.println(m.getName());
    }
}
