//linkedlist demo
import java.util.*;
public class program18 {
    void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<Integer>();
        System.out.println("Enter the size of the list: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            list.add(sc.nextInt());
        }
        System.out.println("The list is: " + list);
        System.out.println("Enter the element to be searched: ");
        int key = sc.nextInt();
        if(list.contains(key)){
            System.out.println("Element found in the list at index: " + list.indexOf(key));
        }
        else{
            System.out.println("Element not found in the list.");
        }
    }
}
