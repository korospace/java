package C1.abstrackCollections;

import java.util.Queue;

public class App {
    public static void main(String[] args) {
        Queue<String> queue = new SingleQueue<>();

        System.out.println(queue.size());
        System.out.println(queue.offer("bagas"));
        System.out.println(queue.offer("koro"));
        System.out.println(queue.size());

        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.size());
    }
}
