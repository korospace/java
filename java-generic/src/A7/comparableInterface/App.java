package A7.comparableInterface;

import java.util.Arrays;
import java.util.Comparator;

public class App {
    public static void main(String[] args) {
        Person[] people1 = {
          new Person("zahra"),
          new Person("akbar"),
          new Person("johan"),
          new Person("maryam"),
          new Person("abyu"),
        };

        Arrays.sort(people1); // Class Person must implement Comparable
        System.out.println(Arrays.toString(people1));

        /*
        * Comparator Interface
        */
        Person[] people2 = {
                new Person("zahra"),
                new Person("akbar"),
                new Person("johan"),
                new Person("maryam"),
                new Person("abyu"),
        };

        Comparator<Person> myComparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        //Arrays.sort(people2,myComparator);
        Arrays.sort(people2,myComparator.reversed()); // Class Person not must implement Comparable
        System.out.println(Arrays.toString(people2));
    }
}
