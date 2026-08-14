class person
{
    int age =20;
    String name = "person";
    class student
    {
        int roll=20;
        String name = "stud";
        class topper
        {
            int roll=101;
        }
    }


}
public class nested_class {
    static void main() {
        person p =new person();

        person.student obj = p.new student();

        //person.teacher obj1 = p.new teacher();

     person.student.topper i = obj.new topper();

        System.out.println(obj.name);

    }
}
