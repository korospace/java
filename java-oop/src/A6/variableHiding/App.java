package A6.variableHiding;

public class App {
    public static void main(String[] args) {
        TheChild child = new TheChild();
        child.doIt();
        System.out.println(child.status);

        Parent parent = new Parent();
        parent.doIt();
        System.out.println(parent.status);

        Parent parent2 = (Parent) child;
        parent2.doIt();
        System.out.println(parent2.status);
    }
}
