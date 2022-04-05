package A9.queue;

import java.util.*;

public class App {
    public static void main(String[] args) {

        //Queue<String> names = new ArrayDeque<>(); // like ArrayList
        //Queue<String> names = new LinkedList<>(); // like LinkedList
        Queue<String> names = new PriorityQueue<>(); // With sorting

        names.add("Muhammad");
        names.add("akbar");
        names.add("bagas");
        names.add("koro");

        System.out.println(names.size());
        for (String next = names.poll();next != null;next = names.poll()) {
            System.out.println(next);
        }
        System.out.println(names.size());
    }
}
