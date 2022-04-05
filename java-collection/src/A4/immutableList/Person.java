package A4.immutableList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {
    private List<String> hobbies;

    public Person() {
        this.hobbies = new ArrayList<>();
    }

    public List<String> getHobbies() {
        return Collections.unmodifiableList(hobbies);
    }

    public void setHobbies(String hobby) {
        this.hobbies.add(hobby);
    }
}
