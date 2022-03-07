package constructor;

public class Person {
    String name;
    Integer age;

    Person (String yourName,Integer yourAge) {
        name = yourName;
        age = yourAge;
    }

    /*
    * Constructor overloading
    */
    Person (String yourName) {
        this(yourName,null);
    }

    Person () {
        System.out.println("give value by your self");
    }

    void sayHello(String client) {
        System.out.println("Hai "+client+", my name is "+name+" iam "+age+" years old");
    }
}
