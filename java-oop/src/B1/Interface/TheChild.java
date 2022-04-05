package B1.Interface;

public class TheChild implements Mother,Father{
    /*
    * Every Child class must re-declare all methods in their interface
    * except default methods
    */
    public String getHomeTown() {
        return null;
    }

    public Integer getInheritence() {
        return null;
    }

    public void sayHello() {

    }

    public Integer getAge() {
        return 10;
    }

    public void sayAddress() {

    }

    public String getPhoneNumber() {
        return "085155352499";
    }
}
