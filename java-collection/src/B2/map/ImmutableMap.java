package B2.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ImmutableMap {
    public static void main(String[] args) {
        Map<String,String> emptyMap = Collections.emptyMap();
        Map<String,String> singleMap = Collections.singletonMap("name","koro");

        Map<String,String> names = new HashMap<>();
        names.put("name.first","bagas");
        names.put("name.last","koro");
        Map<String,String> unmodifableNames = Collections.unmodifiableMap(names);

        Map<String,String> students = Map.of(
          "name.first","koro",
                "name.last","koro"
        );
    }
}
