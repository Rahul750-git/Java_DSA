package Collections.LinkedList;

import java.util.LinkedList;

public class removeFirst {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        System.out.println("Before remove a first index element: " + ll);
        ll.removeFirst();
        System.out.println("After remove a first index element: " + ll);
    }

}
