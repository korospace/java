package A5.lamdaInCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIfApp {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("muhammad");
        names.add("akbar");
        names.add("bagas");
        names.add("koro");

        names.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("o");
            }
        });

        names.removeIf(s -> s.contains("s"));

        System.out.println(names);
    }
}
