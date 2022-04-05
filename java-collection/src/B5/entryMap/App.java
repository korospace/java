package B5.entryMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App {

    public static void main(String[] args) {
        Map<String,String> names = new HashMap<>();

        names.put("A", "A value");
        names.put("B", "B value");
        names.put("C", "C value");
        names.put("D", "D value");

        Set<Map.Entry<String,String>> namesEntry = names.entrySet();

        for (var entry : namesEntry) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
    
}