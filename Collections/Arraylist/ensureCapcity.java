package Collections.Arraylist;

import java.util.ArrayList;

public class ensureCapcity {
    public static void main(String[] args) {
        // ensureCapacity method is used to increase the capacity of the ArrayList
        // if we know that we are going to add a large number of elements to the ArrayList, we can use ensureCapacity to avoid unnecessary resizing of the ArrayList.

        // example:
        ArrayList<Integer> arr = new ArrayList<>();
        arr.ensureCapacity(100); // this will ensure that the capacity of the ArrayList is at least 100
      
    }
    
}
