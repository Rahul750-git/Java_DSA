package Collections.Vector;

import java.util.Vector;

public class toArray {
    public static void main(String[] args) {

        Vector<Integer> list = new Vector<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
     
        System.out.println(list.toArray());
    }
}