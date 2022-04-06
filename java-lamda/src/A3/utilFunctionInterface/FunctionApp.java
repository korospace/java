package A3.utilFunctionInterface;

import java.util.function.Function;

public class FunctionApp {
    public static void main(String[] args) {
        Function<String,Integer> name1Length = new Function<String,Integer>() {
            @Override
            public Integer apply(String name) {
                return name.length();
            }
        };
        System.out.println(name1Length.apply("bagas"));

        Function<String,Integer> name2Length = name -> name.length();
        System.out.println(name2Length.apply("korospace"));
    }
}
