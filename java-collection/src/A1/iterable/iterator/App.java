package A1.iterable.iterator;

import java.util.Iterator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // iterable
        Iterable<String> names = List.of("muhammad","akbar","bagas","koro");

        for (var x:names) {
            System.out.println(x);
        }

        System.out.println("========================");

        // iterator
        Iterator<String> namesIterator = names.iterator();

        while (namesIterator.hasNext()){
            System.out.println(namesIterator.next());
        }
    }
}
