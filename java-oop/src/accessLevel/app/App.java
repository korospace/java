package accessLevel.app;

import accessLevel.src.*;

public class App {
    public static void main(String[] args) {
        Parent parent = new Parent();
        TheStepChild stepChild = new TheStepChild();
        SamePackage samePackage = new SamePackage();

        /*
        * Public
        */
        parent.varPublic = "public property";
        System.out.println(parent.varPublic);

        /*
        * Protected
        */
        // parent.varProtected = "protected properties";
        // error, try it in subClass

        stepChild.setVarProtected("protected properties");
        System.out.println(stepChild.getVarProtected());

        /*
        * No-modifier
        * try it in same package
        */
        samePackage.setVarNoModifier("no modifier");
        System.out.println(samePackage.getVarNoModifier());

        /*
        * Private
        */
        System.out.println(parent.getVarPrivate());
    }
}
