package B4.navigableMap;

import java.util.Collections;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) {
        NavigableMap<String,String> names = new TreeMap<>();

        names.put("A","Ari");
        names.put("C","Cika");
        names.put("B","Bagas");
        names.put("D","Dodi");

        for (var key:names.keySet()) {
            System.out.println(key);
        }

        System.out.println("=========");

        System.out.println(names.lowerKey("B"));
        System.out.println(names.lowerEntry("B"));

        System.out.println("=========");

        System.out.println(names.descendingMap());

        /*
        * NavigableMap Immute
        */
        NavigableMap<String,String> nameImmute1 = Collections.emptyNavigableMap();
        NavigableMap<String,String> nameImmute2 = Collections.unmodifiableNavigableMap(names);
    }
}
