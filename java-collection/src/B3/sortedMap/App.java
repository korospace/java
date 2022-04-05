package B3.sortedMap;

import java.util.Collections;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) {
        SortedMap<String,String> names1 = new TreeMap<>();
        names1.put("B","ini b");
        names1.put("C","ini c");
        names1.put("A","ini a");

        for (var key:names1.keySet()) {
            System.out.println(names1.get(key));
        }

        SortedMap<String,String> names2 = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1); //DESC
            }
        });

        names2.put("B","ini b");
        names2.put("C","ini c");
        names2.put("A","ini a");

        for (var key:names2.keySet()) {
            System.out.println(names2.get(key));
        }

        /*
        * Immutable SortedMap
        * */
        SortedMap<String,String> immutable1 = Collections.emptySortedMap();
        SortedMap<String,String> immutable2 = Collections.unmodifiableSortedMap(names1);
    }
}
