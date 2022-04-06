package A4.methodReference;

import java.util.function.Function;

public class ReferenceParameter {
    public static void main(String[] args) {
        Function<String,Integer> upperName1 = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };

        System.out.println(upperName1.apply("eko"));

        Function<String,Integer> uppername2 = String::length;
        System.out.println(uppername2.apply("johan"));
    }
}
