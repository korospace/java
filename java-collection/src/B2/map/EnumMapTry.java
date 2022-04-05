package B2.map;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapTry {
    public static enum Level {
        free,standart,premium,vip
    }

    public static void main(String[] args) {
        Map<Level,String> level = new EnumMap<Level, String>(Level.class);

        level.put(Level.free,"this is free");
        level.put(Level.standart,"this is standart");

        for (var key:level.keySet()) {
            System.out.println(level.get(key));
        }
    }
}
