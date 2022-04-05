package A7.accessLevel.app;

import A7.accessLevel.src.Parent;

public class TheStepChild extends Parent {
    /*
    * try protected
    */
    public void setVarProtected(String value) {
        this.varProtected = value;
    }
    public String getVarProtected() {
        return this.varProtected;
    }

     /*
     * try no-modifier
     * error, try it in same package
     */
    //public void setVarNoModifier(String value) {
    //   this.varNoModifier = value;
    //}

     /*
     * try private
     * must use setter and getter
     */

}
