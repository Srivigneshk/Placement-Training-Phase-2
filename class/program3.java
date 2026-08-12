import java.util.*;
public class program3 {

    class Management{
        void display(){
            System.out.println("This is a Educational management.");
        }
    }

    class school extends Management{
        String name;
        void teach(String teacher){
            System.out.println("Teacher : " + teacher );
        }
    }

    class college extends Management{
        void teach(String professor){
            System.out.println("Professor : " + professor );
        }
        void transport(String transport){
            System.out.println("Transport : " + transport );
        }
    }

    class placement extends Management{
        void info(String teacher,String company,String training){
            System.out.println("Teacher : " + teacher);
            System.out.println("Company : " + company);
            System.out.println("Training : " + training);
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Management m = new Management();
        m.display();
    }
}
