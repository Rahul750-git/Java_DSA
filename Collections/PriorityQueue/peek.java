package Collections.PriorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class peek {
   public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();
        // Default behaviour -> Integers -> less value -> high Priority
        pq.offer(10);
        pq.offer(20);
        pq.offer(30);
        pq.offer(40);
        pq.offer(50);
        System.out.println(" peek the element before : " + pq);
        System.out.println(" peek element : "+ pq.peek());
        

    } 
}
