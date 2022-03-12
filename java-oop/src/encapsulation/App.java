package encapsulation;

public class App {
    public static void main(String[] args) {
        Parent parent = new Parent();

        parent.setName("Johan");
        parent.setRich(true);

        System.out.println(parent.getName());
        System.out.println(parent.isRich());
    }
}
