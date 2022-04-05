package C5.konversiToArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.addAll(List.of("Muhammad","Akbar","Bagas","koro","ganteng","idaman"));

        Object[] obj = names.toArray();
        String[] arrStr = names.toArray(new String[]{});

        System.out.println(Arrays.toString(obj));
        System.out.println(Arrays.toString(arrStr));

    }
}
