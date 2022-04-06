package A5.lamdaInCollection;

import java.util.List;
import java.util.function.Consumer;

public class ForeachApp {
    public static void main(String[] args) {
        List<String> names = List.of("muhammad","akbar","bagas","koro");

        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        names.forEach(s -> System.out.println(s));
    }
}
