class Student
{
    int roll_no;
    String name;
    float cgpa;
    Student(int roll_no,String name ,float cgpa)
    {
        this.roll_no = roll_no;
        this.name = name;
        this.cgpa = cgpa;
    }
}
public class student_DB {
    static void main() {
      Student s1 = new Student(101,"AAAA",8.11f);
        Student s2 = new Student(102,"BBBB",9.11f);
        System.out.println(s2.roll_no);
        System.out.println(s2.name);
        System.out.println(s2.cgpa);

        Student[] list =new Student[5];
    }
}
