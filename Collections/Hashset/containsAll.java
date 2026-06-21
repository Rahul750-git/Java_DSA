package Collections.Hashset;

import java.util.HashSet;
import java.util.Set;

public class containsAll {
    public static void main(String[] args) {
         Set<Integer> st1 = new HashSet<>();
        st1.add(1);
        st1.add(2);
        st1.add(3);
        st1.add(4);
        Set<Integer> st2 = new HashSet<>();
        st2.add(3);
        st2.add(4);
        st2.add(5);
        st2.add(6);
        st2.add(7);
        System.out.println(st1.containsAll(st2));
    }
    
}
