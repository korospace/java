package A4.inheritence;

public class MyParent {
    String name;

    /*
    * CONSTRUCTOR
    * if parent have construc with parameter
    * the child must have construct and call the parent's construct
    * use super(paramName);
    */
    MyParent (String name) {

    }

    void sayHello (Integer age) {
        System.out.println("Hi, my name is "+this.name+" i'am "+age+" years old");
    }

    String tellAddress() {
        return "Cendana residence B1 No.2";
    }
}
