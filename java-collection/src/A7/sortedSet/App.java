package A7.sortedSet;

import java.util.*;

public class App {
    public static void main(String[] args) {
        SortedSet<Person> people = new TreeSet<>(new PersonComparator().reversed());

        people.addAll(Set.of(
                new Person("rita"),
                new Person("zahra"),
                new Person("fandi")
        ));
        people.add(new Person("johan"));
        people.add(new Person("budi"));
        people.add(new Person("nikita"));

        System.out.println(people);

        /*
        * Immutable SortedSet
        */
        //SortedSet<Person> immutablePeople = Collections.emptySortedSet();
        SortedSet<Person> immutePeople = Collections.unmodifiableSortedSet(people);
        immutePeople.add(new Person("haha")); // error
    }
}
