package C3.defaultMethodMap;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class App {
    public static void main(String[] args) {
        Map<String,String> names = new HashMap<>();

        names.putAll(Map.of(
            "A","A value",
            "B","B value",
            "C","C value",
            "D","D value"
        ));

        names.forEach(new BiConsumer<String,String>() {
            @Override
            public void accept(String t, String u) {
                System.out.println(t+":"+u);                
            }
        });
    }
}
