package B3.equals;

public class App {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        Parent parent2 = new Parent();
        TheChild child = new TheChild();

        System.out.println(parent1.equals(parent2)); //true
        System.out.println(parent1.equals(child)); //false
    }
}
