package Collections.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class poll {
        public static void main(String[] args) {
        
        Queue<Integer> Q = new LinkedList<>();
        Q.offer(10);
        Q.offer(20);
        Q.offer(30);
        System.out.println(Q.poll());
    }
    
}
