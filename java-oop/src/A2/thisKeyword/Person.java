package A2.thisKeyword;

public class Person {
    /*
    * This keyword will represent current object
    */
    String name;

    Person(String name) {
        // name = name; // variable shadowing
        this.name = name;
    }

    void sayHello (String name) {
        // System.out.println("Hi "+name+", my name is "+name); // variable shadowing
         System.out.println("Hi "+name+", my name is "+this.name);
    }
}
