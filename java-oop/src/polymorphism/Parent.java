package polymorphism;

public class Parent {
    String name;
    Integer age;

    Parent (String name,Integer age) {
        this.name = name;
        this.age = age;
    }

    void sayHelloFromParent() {
        System.out.println("Parent: Hello my name is "+this.name);
    }
}
