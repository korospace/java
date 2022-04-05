package B9.collectionsClass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        
        names.addAll(List.of("dodi","bagas","cika","akbar"));
        System.out.println(names);

        Collections.reverse(names);
        System.out.println(names);

        Collections.shuffle(names);
        System.out.println(names);

    }
}
