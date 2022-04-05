package A5.set;

import java.util.*;

public class App {
    public static void main(String[] args) {
        // hashSet
        Set<String> names1 = new HashSet<>();

        names1.addAll(Set.of("empat","lima","enam"));
        names1.add("satu");
        names1.add("dua");
        names1.add("tiga");

        for (var x:names1) {
            System.out.println(x);
        }

        System.out.println("==============");

        // linkedHashSet
        Set<String> names2 = new LinkedHashSet<>();
        names2.add("satu");
        names2.add("dua");
        names2.add("tiga");

        for (var x:names2) {
            System.out.println(x);
        }

        System.out.println("==============");

        // Enum Set
        EnumSet<Gender> genders = EnumSet.allOf(Gender.class);
        //EnumSet<Gender> genders = EnumSet.of(Gender.MALE,Gender.FEMALE);
        //Gender[] genders = Gender.values();
        //Set<Gender> genders = EnumSet.of(Gender.MALE,Gender.FEMALE);
        //Set<Gender> genders = EnumSet.allOf(Gender.class);

        for (var x:genders) {
            System.out.println(x);
        }
    }

    public static enum Gender {
        MALE,FEMALE,WTF
    }
}
