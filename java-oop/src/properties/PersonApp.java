package properties;

public class PersonApp {
    public static void main(String[] args) {
        /*
        * Declaration objeck
        */
        var person1 = new Person(); // type 1

        Person person2 = new Person(); // type 2

        Person person3; // type 3
        person3 = new Person();

        /*
        * Assignment properties value
        */
        person1.name = "Bagaskoro";
        person1.age = 22;
        System.out.println("Person1 name: "+person1.name);
        System.out.println("Person1 age: "+person1.age);
        System.out.println("Person1 religion: "+person1.religion);
    }
}
