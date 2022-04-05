package A6.immutableSet;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Set<String> empty = Collections.emptySet();
        Set<String> single = Collections.singleton("satu");

        Set<String> names = new LinkedHashSet<>();
        names.add("dua");
        names.add("tiga");
        Set<String> nameImmutable = Collections.unmodifiableSet(names);

        Set<String> products = Set.of("empat","lima","enam");
    }
}
