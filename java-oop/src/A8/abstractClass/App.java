package A8.abstractClass;

public class App {
    public static void main(String[] args) {
        // Parent parent = new Parent(); // Error: because abstract class

        TheChild theChild = new TheChild();
        theChild.setName("nana");
        System.out.println(theChild.getName());
    }
}
