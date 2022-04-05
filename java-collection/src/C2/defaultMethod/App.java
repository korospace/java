package C2.defaultMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class App {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        numbers.replaceAll(new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer t) {
                return t*2;
            }
        });

        System.out.println(numbers);

        numbers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer t) {
                System.out.println(t);                
            }
        });

        numbers.removeIf(new Predicate<Integer>() {
            public boolean test(Integer t) {
                return t > 10;
            }
        });

        System.out.println(numbers);
    }
}
