package A3.utilFunctionInterface;

import java.util.function.Supplier;

public class SuplierApp {
    public static void main(String[] args) {
        Supplier<String> name1 = new Supplier<String>() {
            @Override
            public String get() {
                return "Muhammad Akbar Bagaskoro";
            }
        };
        System.out.println(name1.get());

        Supplier<String> name2 = () -> "Johan Setiabudi";
        System.out.println(name2.get());
    }
}
