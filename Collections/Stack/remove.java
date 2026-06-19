package Collections.Stack;

import java.util.Stack;
import java.util.Vector;

public class remove {
 
     public static void main(String[] args) {
        Vector<Integer> list = new Stack<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        
        System.out.println("Before remove element is : " +list);
        list.remove(2);
        System.out.println("After remove element is : " +list);

    }
}   

