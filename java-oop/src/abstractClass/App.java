package abstractClass;

public class App {
    public static void main(String[] args) {
        // Parent parent = new Parent(); // Error: because abstract class

        TheChild theChild = new TheChild();
        theChild.name = "this is child";
        System.out.println(theChild.name);
    }
}
