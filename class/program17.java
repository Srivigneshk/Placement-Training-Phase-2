//element segregation in array list
import java.util.*;
public class program17 {
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Enter the size of the list: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            list.add(sc.nextInt());
        }
        System.out.println(list);
        ArrayList<Integer> evenList = new ArrayList<Integer>();
        ArrayList<Integer> oddList = new ArrayList<Integer>();
        for(int i=0; i<list.size(); i++){
            if(list.get(i) % 2 == 0){
                evenList.add(list.get(i));
            }
            else{
                oddList.add(list.get(i));
            }
        }
        System.out.println("Even elements: " + evenList);
        System.out.println("Odd elements: " + oddList);
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
