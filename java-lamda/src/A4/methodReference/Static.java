package A4.methodReference;

import java.util.function.Predicate;

public class Static {
    public static void main(String[] args) {
        Predicate<String> check1 = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return UtilClass.isLowerStatic(s);
            }
        };
        System.out.println(check1.test("baGas"));

        Predicate<String> check2 = value -> UtilClass.isLowerStatic(value);
        System.out.println(check2.test("bagas"));

        Predicate<String> check3 = UtilClass::isLowerStatic;
        System.out.println(check3.test("bagas"));
    }
}
