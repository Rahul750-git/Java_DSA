package Collections.ArrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class poll {
    public static void main(String[] args) {
        Deque<Integer> Q = new ArrayDeque<>();
        Q.add(10);
        Q.offer(20);
        Q.offerFirst(30);
        Q.offerLast(40);
        System.out.println("Polling the element Before : " + Q);
        Q.poll();
        Q.pollFirst();
        Q.pollLast();
        System.out.println("Polling the element After :  " + Q);
    }
}
