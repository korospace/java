package A2.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class App {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();

        // Add element
        names.add("Muhammad");
        names.addAll(Arrays.asList("Akbar","bagas","koro","ganteng"));

        for (var x:names) {
            System.out.println(x);
        }

        System.out.println("========================");

        // Delete element
        names.remove("Muhammad");
        names.removeAll(Arrays.asList("Akbar","bagas"));

        for (var x:names) {
            System.out.println(x);
        }

        System.out.println("========================");

        // Check element
        System.out.println(names.contains("koro"));
        System.out.println(names.containsAll(Arrays.asList("bagas","ganteng")));
    }
}
