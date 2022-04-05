package A8.navigableSet;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        NavigableSet<String> names = new TreeSet<>();

        names.addAll(Set.of("johan","budi","fabian","rizki"));
        names.add("zahra");
        names.add("syifa");

        System.out.println(names);
        System.out.println(names.descendingSet());
        System.out.println(names.headSet("syifa",true));
        System.out.println(names.tailSet("rizki",true));

        /*
        * Immutable Navigable
        */
        // NavigableSet<String> immutableNames = Collections.emptyNavigableSet();
        NavigableSet<String> immutableNames = Collections.unmodifiableNavigableSet(names);
    }
}
