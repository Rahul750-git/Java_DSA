package Collections.Stack;


import java.util.Collections;
import java.util.Stack;

public class Sorting {
    public class SortingMethod {
  
    public static void main(String[] args) {
        Stack<Integer> collect = new Stack<>();
        collect.add(1);
        collect.add(5);
        collect.add(2);
        collect.add(3);
        collect.add(4);
        System.out.println("Print entire element " + collect);

        // Sorting Method is:
      Collections.sort(collect);
      System.out.println(collect);
    }
    
}
    
} 
