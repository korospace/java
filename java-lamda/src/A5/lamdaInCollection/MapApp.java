package A5.lamdaInCollection;

import java.util.Map;
import java.util.function.BiConsumer;

public class MapApp {
    public static void main(String[] args) {
        Map<String,String> names = Map.of(
                "A","A value",
                "B","B value",
                "C","C value"
        );

        names.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String s, String s2) {
                System.out.println(s+":"+s2);
            }
        });

        names.forEach((s,s2) -> System.out.println(s+":"+s2));
    }
}
