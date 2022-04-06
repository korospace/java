package A4.methodReference;

import java.util.function.Predicate;

public class NonStatic {
    public static void main(String[] args) {
        UtilClass utilClass = new UtilClass();

        Predicate<String> check1 = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return UtilClass.isLowerStatic(s);
            }
        };
        System.out.println(check1.test("baGas"));

        Predicate<String> check2 = s -> utilClass.isLowerNonStatic(s);
        System.out.println(check2.test("bagas"));

        Predicate<String> check3 = utilClass::isLowerNonStatic;
        System.out.println(check3.test("bagas"));
    }
}
