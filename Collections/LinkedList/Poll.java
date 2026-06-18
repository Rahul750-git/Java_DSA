package Collections.LinkedList;

import java.util.LinkedList;

public class Poll {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(12);
        ll.add(101);
         System.out.println("Before polling list is : " + ll);
        // Poll method first element ko remove bhi kar ta hai or print bhi
        System.out.println("Poll element is : " + ll.poll());
        System.out.println("After polling  list is : " + ll);
    }

}
