import java.util.*;
class Setter{
    String name;
    long rollno;
    char age;
    String mobile;

    void getinfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        name = sc.nextLine();
        System.out.println("Enter Roll No : ");
        rollno = sc.nextLong();
        System.out.println("Enter Age (M:Male, F:Female): ");
        age = sc.next().charAt(0);
        System.out.println("Enter Mobile NUmber : ");
        mobile = sc.next();
    }
    void displayinfo(){
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);
        System.out.println("Age: " + age);
        System.out.println("Mobile Number: " + mobile);
    }
    void setMobileNumber(String mobile){
        this.mobile = mobile;
    }

}
public class program6 {
    void main(String[] args){
        Setter a1 = new Setter();
        a1.getinfo();
        a1.displayinfo();
        a1.setMobileNumber("1234567890");
        a1.displayinfo();
    }
}
