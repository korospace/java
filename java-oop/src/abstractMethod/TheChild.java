package abstractMethod;

public class TheChild extends Parent{

    /*
    * abstract method must be re-declared in child class.
    * if you wont re-declare it, use abstract keyword in child class
    *
    * example:
    * abstrac public class TheChild extends Parent {}
    */
    public String getName() {
        return this.name;
    }
}
