package B6.legacyCollection;

import java.util.Stack;

public class StackApp {
    public static void main(String[] args) {

        /**
         * LIFO (Last In First Out)
         */
        Stack<String> names = new Stack<>();

        names.add("A");
        names.add("B");
        names.add("C");
        names.add("D");

        for (String name = names.pop(); names != null; name = names.pop()) {
            System.out.println(name);
        }
    }
}
