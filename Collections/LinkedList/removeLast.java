package Collections.LinkedList;

import java.util.LinkedList;

public class removeLast {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        System.out.println("Before remove a last index element: " + ll);
        ll.removeLast();
        System.out.println("After remove a last index element: " + ll);
    }

}
  