package accessLevel.src;

public class SamePackage{
    Parent parent = new Parent();

    // try no-modifier
    public void setVarNoModifier(String value) {
        parent.varNoModifier = value;
    }
    public String getVarNoModifier() {
        return parent.varNoModifier;
    }
}
