package Collections.Stack;

import java.util.Stack;
import java.util.Vector;

public class addAll {
    public static void main(String[] args) {
        Vector<Integer> list = new Stack<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Vector<Integer> list2 = new Stack<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(3, 8);
        list.addAll(list2);
        System.out.println(list);
    }
}
