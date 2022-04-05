package C4.spliteratorInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class App {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.addAll(List.of("Muhammad","Akbar","Bagas","koro","ganteng","idaman"));

        Spliterator<String> namesSplit1 = names.spliterator();
        Spliterator<String> namesSplit2 = namesSplit1.trySplit();

        System.out.println(namesSplit1.estimateSize());
        System.out.println(namesSplit2.estimateSize());

        namesSplit2.forEachRemaining(new Consumer<String>() {
            @Override
            public void accept(String t) {
                System.out.println(t);                
            }
        });

    }
}
