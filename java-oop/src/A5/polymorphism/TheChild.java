package A5.polymorphism;

public class TheChild extends Parent{
    TheChild (String name,Integer age) {
        super(name,age);
    }

    void sayHelloFromChild() {
        System.out.println("Child: Hello my name is "+this.name);
    }
}
