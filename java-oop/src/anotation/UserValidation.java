package anotation;

import java.lang.reflect.Field;

public class UserValidation {

    @Deprecated
    public static void validate(CreateUser createUser) {
        Class aClass = createUser.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for (var field:fields) {
             field.setAccessible(true);

            if (field.getAnnotation(NoBlank.class) != null) {
                try {
                    String value = (String) field.get(createUser);
                    if (value == null || value.isBlank()){
                        throw new NullPointerException("field "+field.getName()+" is null");
                    }
                } catch(IllegalAccessException e) {
                    System.out.println("Can't access field "+field.getName());
                }
            }
        }
    }
}
