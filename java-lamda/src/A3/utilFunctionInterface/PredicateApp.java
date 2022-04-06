package A3.utilFunctionInterface;

import java.util.function.Predicate;

public class PredicateApp {
    public static void main(String[] args) {
        Predicate<String> check1 = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.isBlank();
            }
        };
        System.out.println(check1.test(""));

        Predicate<String> check2 = s -> s.isBlank();
        System.out.println(check2.test("haha"));
    }
}
