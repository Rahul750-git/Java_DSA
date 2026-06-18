package Collections.Arraylist;
import java.util.ArrayList;
public class CloneMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(4);
        list1.set(2, 3);
        ArrayList<Integer> newList = (ArrayList<Integer>)list1.clone();
        System.out.println("Original List: " + list1);
        System.out.println("Cloned List: " + newList);
       
    }
    
}
