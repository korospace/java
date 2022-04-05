package B2.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTry {
    public static void main(String[] args) {
        Map<String,String> xx = new LinkedHashMap<>();
        xx.put("satu","xx satu");
        xx.put("dua","xx dua");
        xx.put("tiga","xx tiga");

        for (var key:xx.keySet()) {
            System.out.println(xx.get(key));
        }

        System.out.println("==========");

        Map<String,String> yy = new HashMap<>();
        yy.put("satu","xx satu");
        yy.put("dua","xx dua");
        yy.put("tiga","xx tiga");

        for (var key:yy.keySet()) {
            System.out.println(yy.get(key));
        }
    }
}
