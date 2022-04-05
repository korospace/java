package B2.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTry {
    public static void main(String[] args) {
        Map<String,String> students = new HashMap<>();

        students.putAll(Map.of(
                "name1.first","akbar",
                "name1.middle","bagas",
                "name1.last","koro"
        ));

        students.put("name2.first","akbar");
        students.put("name2.middle","bagas");
        students.put("name2.last","koro");

        //System.out.println(students.get("name1.first"));
        System.out.println(students.values());
    }
}
