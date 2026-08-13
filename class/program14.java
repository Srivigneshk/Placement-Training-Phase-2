//List interface
import java.util.*;
public class program14 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Grapes");
        System.out.println("List: " + list);
        System.out.println("Size of the list: " + list.size());
        System.out.println("Is the list empty? " + list.isEmpty());
        System.out.println("Does the list contain 'Banana'? " + list.contains("Banana"));
        System.out.println("Index of 'Orange': " + list.indexOf("Orange"));
        System.out.println("Element at index 2: " + list.get(2));
        list.remove(1);
        System.out.println("List after removing element at index 1: " + list);
    }
}