package A7.optionalClass;

import java.util.Optional;

public class App {
    public static void main(String[] args) {
        sayHello("bagas");
        System.out.println("======");
        sayHello(null);
    }

    public static void sayHello(String name) {
        Optional<String> nameLower = Optional.ofNullable(name);
        Optional<String> nameUpper = nameLower.map(String::toUpperCase);
        nameUpper.ifPresent(val -> System.out.println("cara1: "+val));

        Optional.ofNullable(name)
                .map(String::toUpperCase)
                //.ifPresent(System.out::println);
                .ifPresentOrElse(
                        valueUpper -> System.out.println("cara2: "+valueUpper),
                        () -> System.out.println("cara2: name is blank")
                );

        String nameUpper2 = Optional.ofNullable(name)
                .map(String::toUpperCase)
                //.orElseGet(() -> "TEMAN");
                .orElse("TEMAN");

        System.out.println("get value:"+nameUpper2);
    }
}
