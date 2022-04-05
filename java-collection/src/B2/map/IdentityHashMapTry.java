package B2.map;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapTry {
    public static void main(String[] args) {
        String key1 = "name.first";
        String name = "name";
        String first = "first";
        String key2 = name+"."+first;

        /*
        * IdentityHashMap using equality(==) for compare the key
        * */
        Map<String,String> test1 = new IdentityHashMap<>();

        test1.put(key1,"bagas");
        test1.put(key2,"bagas");
        System.out.println(test1.size()); // out: 2
    }
}
