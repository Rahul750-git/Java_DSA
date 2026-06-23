package Collections.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class values {
    public static void main(String[] args) {
        Map<String, String> mapping = new HashMap<>();
        mapping.put("in", "India");
        mapping.put("en", "England");
        mapping.put("ca", "Canda");
        mapping.put("It", "Itly");
        mapping.put("af", "Africa");
        Collection<String> valueset = mapping.values();
        System.out.println(valueset);
    }
    
}
