package Collections.TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class add {
    public static void main(String[] args) {
        Set<Integer> st = new TreeSet<>();
        st.add(40);
        st.add(10);
        st.add(10);
        st.add(20);
        st.add(20);
        st.add(30);
        System.out.println(st);
    }
}
