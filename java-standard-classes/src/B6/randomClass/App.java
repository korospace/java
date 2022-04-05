package B6.randomClass;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();

        for(int i = 1; i <= 100; i++) {
            System.out.println(random.nextInt(100));
        }
    }
}
