package C4.anotation;

public class App {
    public static void main(String[] args) {
        createUser("",null);
    }

    static void createUser(String name,Integer age) {
        CreateUser createUser = new CreateUser(name,age);

        try {
            UserValidation.validate(createUser);
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}
