package equals;

public class Parent {
    String name;
    Integer age;

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Parent parent = (Parent) o;

        if (name != null ? !name.equals(parent.name) : parent.name != null) return false;
        return age != null ? age.equals(parent.age) : parent.age == null;
    }
}
