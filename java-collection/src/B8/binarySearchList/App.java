package B8.binarySearchList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.addAll(List.of("dodi","bagas","cika","andre"));
        Collections.sort(names);

        int index = Collections.binarySearch(names, "andre");
        System.out.println(index);

        // Comparator<String> reverse = new Comparator<String>() {
        //     @Override
        //     public int compare(String o1, String o2) {
        //         return o2.compareTo(o1);
        //     }
        // };

        // int index2 = Collections.binarySearch(names, "andre", reverse);
        // System.out.println(index2);

    }
}
