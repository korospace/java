package B4.hashCode;

public class App {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        Parent parent2 = new Parent();

        System.out.println(parent1.hashCode() == parent2.hashCode());
    }
}
