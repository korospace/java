package anotation;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface UserAnotation {
    String address();
    String[] name() default {};
}
