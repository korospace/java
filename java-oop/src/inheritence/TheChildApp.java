package inheritence;

public class TheChildApp {
    public static void main(String[] args) {
        TheChild tc = new TheChild();

        tc.name = "ryan";
        tc.sayHello(); // This method is already OVERRIDEN

        System.out.println("Child: "+tc.tellAddress());
        System.out.println("Parent: "+tc.tellParentAddress()); // this method use SUPER Keyword
    }
}
