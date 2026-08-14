class age_validate
{
    void check(int age)
    {
        if(age>=18)
            System.out.println("eligible");
        else
            throw new RuntimeException("not eligible");
    }
}
public class throw_demo {
    static void main() {
        age_validate a = new age_validate();

        a.check(16);

        System.out.println("end of the programs");
    }
}
