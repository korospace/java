package polymorphism;

public class App {
    public static void main(String[] args) {
        TheChild parent = new TheChild("John", 40);
        parent.sayHelloFromParent();

        /*
        * In polymorphism, we can't use methods from child
        */
        parent = new TheChild("Lylia",14);
        // parent.sayHelloFromChild(); // error
        parent.sayHelloFromParent();

        /*
        * Method polymorphism
        */
        showAge(new TheChild("Luqman",23));
        showAge(new TheStepChild("Syifa",20));

        /*
        * Type check & Cast
        */
        showStatus(new TheChild("Rudy",12));
        showStatus(new TheStepChild("Sasha",5));
    }

    public static void showAge(Parent parent) {
        System.out.println(parent.name+": I'am "+parent.age+" years old");
    }

    public static void showStatus(Parent parent) {
        if(parent instanceof TheChild) {
            TheChild tc = (TheChild) parent;
            System.out.println("i'am "+tc.name+" child of John");
        }
        else if(parent instanceof TheStepChild) {
            TheStepChild tsc = (TheStepChild) parent;
            System.out.println("i'am "+tsc.name+" step child of John");
        }
        else {
            System.out.println("i'am john");
        }
    }
}
