package inheritence;

public class TheChild extends MyParent {
    TheChild () {
        super(null);
    }

    /*
    * Method Overriding
    */
    void sayHello() {
        System.out.println("Hi, my name is "+this.name+" i'am the son of Mr. budi");
    }

    /*
    * Super keyword in method
    */
    String tellAddress() {
        return "Ananta residence B6 No.8";
    }

    String tellParentAddress() {
        return super.tellAddress();
    }
}
