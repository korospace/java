package A3.constructor;

public class PersonApp {
    public static void main(String[] args) {
        Person person = new Person("Agus",22);
        person.sayHello("Mrs. susi");

        /*
        * Use constructor overloading
        */
        Person person2 = new Person("Lina");

        person2.age = 23;
        person2.sayHello("Mr. Budi");

        Person person3 = new Person();
    }
}
