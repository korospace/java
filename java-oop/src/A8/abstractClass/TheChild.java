package A8.abstractClass;

public class TheChild extends Parent{
    private String name;

    /*
     * abstract method must be re-declared in child class.
     * if you wont re-declare it, use abstract keyword in child class
     *
     * example:
     * abstrac public class TheChild extends Parent {}
     */
    @Override
    public String getName() {
        return "child: my name is "+this.name;
    }
}
