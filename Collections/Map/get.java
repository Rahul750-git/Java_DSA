package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class get {
        public static void main(String[] args) {
        Map<String, String> mapping = new HashMap<>();
        mapping.put("in", "India");
        mapping.put("en", "England");
        mapping.put("ca", "Canda");
        mapping.put("It", "Italy");
        mapping.put("af", "Africa");
        System.out.println(mapping.get("It"));
    }
    
}
