package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class put {
    public static void main(String[] args) {
        Map<String, String> mapping = new HashMap<>();
        mapping.put("in", "India");
        mapping.put("en", "England");
        mapping.put("ca", "Canda");
        mapping.put("It", "Itly");
        mapping.put("af", "Africa");
        System.out.println(mapping);
    }

}
