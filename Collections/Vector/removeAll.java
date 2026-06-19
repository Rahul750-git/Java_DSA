package Collections.Vector;

import java.util.Vector;

public class removeAll {
    public static void main(String[] args) {
        Vector<Integer> list = new Vector<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Vector<Integer> list2 = new Vector<>();
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(3, 8);
        list.addAll(list2);
        System.out.println("Remove the element before : " + list);
        list.removeAll(list2);
        System.out.println("Remove the element After : " + list);
    }
}
