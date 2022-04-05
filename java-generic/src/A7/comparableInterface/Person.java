package A7.comparableInterface;

public class Person implements Comparable<Person>{

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
        //return this.name.compareTo(o.name); //ASC
        return o.name.compareTo(this.name); //DESC
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                '}';
    }
}
