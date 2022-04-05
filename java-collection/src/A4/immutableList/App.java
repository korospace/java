package A4.immutableList;

import java.util.List;

public class App {
    public static void main(String[] args) {
        Person person = new Person();

        person.setHobbies("coding");
        person.setHobbies("makan");

        doSomething(person.getHobbies());

        for (var x:person.getHobbies()) {
            System.out.println(x);
        }
    }

    public static void doSomething(List<String> hobbies) {
        //hobbies.add("hahaha"); // error
    }
}
