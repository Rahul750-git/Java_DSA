package Collections.LinkedList;

import java.util.LinkedList;

public class Peek {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(12);
        ll.add(101);
        System.out.println("Peek element is : " + ll.peek());
    }
}
