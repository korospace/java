package toString;

public class Parent {
    String name;
    Integer age;

    Parent(String name,Integer age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "My name is "+this.name+" i'am "+this.age+" years old";
    }
}
