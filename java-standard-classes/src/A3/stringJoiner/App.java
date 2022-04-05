package A3.stringJoiner;

import java.util.StringJoiner;

public class App {
    public static void main(String[] args) {
        String[] arrayName = {"Muhammad","Akbar","Bagaskoro"};
        StringJoiner joinerName = new StringJoiner(", ", "{", "}");

        for (var value:arrayName) {
            joinerName.add(value);
        }

        System.out.println(joinerName.toString());
    }
}
