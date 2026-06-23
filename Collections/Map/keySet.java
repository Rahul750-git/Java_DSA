package Collections.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class keySet {
    public static void main(String[] args) {
        Map<String, String> mapping = new HashMap<>();
        mapping.put("in", "India");
        mapping.put("en", "England");
        mapping.put("ca", "Canda");
        mapping.put("It", "Itly");
        mapping.put("af", "Africa");
       
        Set<String> keyset = mapping.keySet();
        System.out.println(keyset);
    }
}
