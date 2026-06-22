package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class putAll {
      public static void main(String[] args) {
        Map<String, String> mapping = new HashMap<>();
        mapping.put("in", "India");
        mapping.put("en", "England");
        mapping.put("ca", "Canda");
        mapping.put("It", "Itly");
        mapping.put("af", "Africa");
        System.out.println("Before : " + mapping);

          Map<String, String> table = new HashMap<>();
          table.put("br", "brazli");
          table.putAll(mapping);
          System.out.println("After :" + table);
    }
}
