package Collections.ArrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class peek {
    public static void main(String[] args) {
        Deque<Integer> Q = new ArrayDeque<>();
        Q.add(10);
        Q.offer(20);
        Q.offerFirst(30);
        Q.offerLast(40);
        System.out.println("Peek the element : " + Q.peek());
        System.out.println("Peek the First Element : " + Q.peekFirst());
        System.out.println("Peek the Last Element : " + Q.peekLast());

    }
}
