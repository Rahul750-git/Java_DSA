package Collections.LinkedList;

import java.util.LinkedList;

public class addLast {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        System.out.println("Before add a Last index element: " + ll);
        ll.addLast(3);
        System.out.println("After add a Last index element: " + ll);
    }
}
