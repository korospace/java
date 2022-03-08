package variableHiding;

public class App {
    public static void main(String[] args) {
        TheChild child = new TheChild();
        System.out.println(child.status);

        Parent parent = (Parent) child;
        System.out.println(parent.status);
    }
}
