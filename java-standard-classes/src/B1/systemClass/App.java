package B1.systemClass;

public class App {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());

        System.out.println(System.getenv("HOME"));
        System.out.println(System.getenv("MY_ENV_VARIABLE"));

        System.gc();

        System.exit(0);
        //System.exit(1); // if a problem occurs

        System.out.println("hello world");
    }
}
