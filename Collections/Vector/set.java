package Collections.Vector;

import java.util.Vector;

public class set {
       public static void main(String[] args) {

        Vector<Integer> list = new Vector<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(3, 8);
        list.set(5,59);
        System.out.println(list);
    }
}
