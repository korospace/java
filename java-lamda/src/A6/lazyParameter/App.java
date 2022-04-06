package A6.lazyParameter;

import java.util.function.Supplier;

public class App {
    public static void main(String[] args) {
        checkNoLazy(79,getName());
        System.out.println("========");
        checkWithLazy(79,() -> getName());
    }

    public static void checkNoLazy(Integer nilai,String name) {
        if (nilai > 80) {
            System.out.println("congrats "+name+", you passed!");
        } else {
            System.out.println("try again");
        }
    }

    public static void checkWithLazy(Integer nilai, Supplier<String> name) {
        if (nilai > 80) {
            System.out.println("congrats "+name.get()+", you passed!");
        } else {
            System.out.println("try again");
        }
    }

    public static String getName() {
        System.out.println("method getName() in progress");
        return "Bagas";
    }
}
