package A3.utilFunctionInterface;

import java.util.function.Consumer;

public class ConsumerApp {
    public static void main(String[] args) {
        Consumer<String> name1 = new Consumer<String>() {
            @Override
            public void accept(String value) {
                System.out.println("Hallo "+value);
            }
        };
        name1.accept("Johan");

        Consumer<String> name2 = value -> System.out.println("Hallo "+value);
        name2.accept("josua");
    }
}
