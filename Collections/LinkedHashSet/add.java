package Collections.LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class add {
    public static void main(String[] args) {
        Set<Integer> st = new LinkedHashSet<>();
        st.add(40);
        st.add(10);
        st.add(10);
        st.add(20);
        st.add(20);
        st.add(30);

        System.out.println(st);

    }
}
