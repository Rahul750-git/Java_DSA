package Collections.LinkedList;

import java.util.LinkedList;

public class addFirst {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(2);
        System.out.println("Before add a first index element: " + ll);
        ll.addFirst(1);
        System.out.println("After add a first index element: " + ll);
    }

}
