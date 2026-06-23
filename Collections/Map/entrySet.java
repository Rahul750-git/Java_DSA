package Collections.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class entrySet {
    public static void main(String[] args) {
        Map<String, String> mapping = new HashMap<>();
        mapping.put("in", "India");
        mapping.put("en", "England");
        mapping.put("ca", "Canda");
        mapping.put("It", "Itly");
        mapping.put("af", "Africa");
        Set<Map.Entry<String,String>> entrySet = mapping.entrySet();
        System.out.println(entrySet);
    }
}
