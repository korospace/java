package accessLevel.src;

public class Parent {
    /*
    * Public
    * Class, Package, Subclass, world
    */
    public String varPublic;

    /*
    * Protected
    * Class, Package, Subclass
    */
    protected String varProtected;

    /*
    * No Modifier
    * Class, Package
    */
    String varNoModifier;

    /*
    * Private
    * Class
    */
    private String varPrivate = "private property";

    public String getVarPrivate() {
        return this.varPrivate;
    }
}
