package B6.legacyCollection;

import java.util.List;
import java.util.Vector;

public class VectorClass {
    public static void main(String[] args) {
        List<String> names = new Vector<>();

        names.add("muhammad");
        names.add("akbar");
        names.add("bagas");
        names.add("koro");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
