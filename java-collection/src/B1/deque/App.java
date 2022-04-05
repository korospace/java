package B1.deque;

import java.util.Deque;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        Deque<String> stack = new LinkedList<>();

        stack.offerLast("muhammad");
        stack.offerLast("akbar");
        stack.offerLast("bagas");
        stack.offerLast("koro");

        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());

        Deque<String> queue = new LinkedList<>();

        queue.offerLast("muhammad");
        queue.offerLast("akbar");
        queue.offerLast("bagas");
        queue.offerLast("koro");

        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
    }
}
