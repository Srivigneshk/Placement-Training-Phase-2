abstract class Employee {
    private String name;
    private double salary;
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    abstract double bonus_cal();
    abstract void display_all();
}
class Developer extends Employee {
    private String type; // Full Stack / MERN Stack
    Developer(String name, double salary, String type) {
        super(name, salary);
        this.type = type;
    }
    @Override
    double bonus_cal() {
        return getSalary() * 0.15;
    }
    @Override
    void display_all() {
        System.out.println("Developer");
        System.out.println("Name : " + getName());
        System.out.println("Salary : " + getSalary());
        System.out.println("Type : " + type);
        System.out.println("Bonus : " + bonus_cal());
        System.out.println();
    }
}
class Manager extends Employee {
    Manager(String name, double salary) {
        super(name, salary);
    }
    @Override
    double bonus_cal() {
        return getSalary() * 0.20;
    }
    @Override
    void display_all() {
        System.out.println("Manager");
        System.out.println("Name : " + getName());
        System.out.println("Salary : " + getSalary());
        System.out.println("Bonus : " + bonus_cal());
        System.out.println();
    }
}
class OfficeWorker extends Employee {
    OfficeWorker(String name, double salary) {
        super(name, salary);
    }
    @Override
    double bonus_cal() {
        return getSalary() * 0.10;
    }
    @Override
    void display_all() {
        System.out.println("Office Worker");
        System.out.println("Name : " + getName());
        System.out.println("Salary : " + getSalary());
        System.out.println("Bonus : " + bonus_cal());
        System.out.println();
    }
}
public class program7 {
    public static void main(String[] args) {
        Developer d = new Developer("Sri", 50000, "MERN Stack");
        Manager m = new Manager("Ravi", 70000);
        OfficeWorker o = new OfficeWorker("Kumar", 30000);
        d.display_all();
        m.display_all();
        o.display_all();
    }
}