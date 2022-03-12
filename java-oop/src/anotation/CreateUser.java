package anotation;

@UserAnotation(address = "Serua, Ciputat",name = {"bagas","koro"})
public class CreateUser {

    @NoBlank
    private String name;
    @NoBlank
    private Integer age;

    public CreateUser(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
