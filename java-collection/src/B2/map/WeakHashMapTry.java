package B2.map;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapTry {
    public static void main(String[] args) {
        Map<Integer,Integer> xx = new WeakHashMap<>();

        for (int i = 0; i < 1_000_000; i++) {
            xx.put(i,i);
        }

        System.gc();
        System.out.println(xx.size());

        Map<Integer,Integer> yy = new HashMap<>();

        for (int i = 0; i < 1_000_000; i++) {
            yy.put(i,i);
        }

        System.gc();
        System.out.println(yy.size());
    }
}
