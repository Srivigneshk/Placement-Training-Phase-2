class Person {
    String name;
    String work;
    Person(String name, String work) {
        this.name = name;
        this.work = work;
    }
    void activity() {
        System.out.println(name + " does general work: " + work);
    }
}
class Student extends Person {
    Student(String name, String work) {
        super(name, work);
    }
    void study() {
        System.out.println(name + " is studying.");
    }
}
class Child extends Student {
    Child(String name, String work) {
        super(name, work);
    }
    void play() {
        System.out.println(name + " is playing.");
    }
}
class Customer extends Person {
    Customer(String name, String work) {
        super(name, work);
    }
    void buy() {
        System.out.println(name + " is buying products.");
    }
}
class Product extends Customer {
    Product(String name, String work) {
        super(name, work);
   }
    void details() {
        System.out.println("Product details checked by " + name);
    }
}
class Visitor extends Person {
    Visitor(String name, String work) {
        super(name, work);
    }
    void visit() {
        System.out.println(name + " is visiting a place.");
    }
}
class Place extends Visitor {
    Place(String name, String work) {
        super(name, work);
    }
    void location() {
        System.out.println(name + " is at location: " + work);
    }
}
public class program2 {
    public static void main(String[] args) {
        Child c = new Child("Arun", "Homework");
        c.activity();
        c.study();   
        c.play();    
        System.out.println();
        Product p = new Product("Meena", "Shopping");
        p.activity();  
        p.buy();       
        p.details();   
        System.out.println();
        Place pl = new Place("Ravi", "Museum");
        pl.activity(); 
        pl.visit();    
        pl.location(); 
    }
}