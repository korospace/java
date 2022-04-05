package A3.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        //List<String> names = new ArrayList<>();
        List<String> names = new LinkedList<>();

        names.add("akbar");
        names.add("bagas");
        names.add("koro");
        names.add("banget");
        names.add("banget");

        System.out.println(names.toString());

        names.set(2,"gans");

        System.out.println(names.toString());

        names.remove(0);
        names.remove("bagas");

        System.out.println(names.toString());
    }
}
