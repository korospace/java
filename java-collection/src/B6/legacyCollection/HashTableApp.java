package B6.legacyCollection;

import java.util.Hashtable;
import java.util.Map;

public class HashTableApp {
    public static void main(String[] args) {
        Map<String,String> names = new Hashtable<>();

        names.put("A", "A value");
        names.put("B", "B value");
        names.put("C", "C value");
        names.put("D", "D value");

        for (var key : names.keySet()) {
            System.out.println(names.get(key));
        }

    }
}
