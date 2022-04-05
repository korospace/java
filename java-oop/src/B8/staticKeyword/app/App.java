package B8.staticKeyword.app;

import B8.staticKeyword.src.StaticClass;
import static B8.staticKeyword.src.StaticProperties.*;
import static B8.staticKeyword.src.StaticMethod.sayHello;
import static B8.staticKeyword.src.StaticBlock.PROCESSORS;

public class App {
    public static void main(String[] args) {
        /*
        * static properties
        */
        // System.out.println(StaticProperties.NAME);
        // System.out.println(StaticProperties.AGE);
        System.out.println(NAME);
        System.out.println(AGE);

        /*
        * static method
        */
        // StaticMethod.sayHello("Johan");
        sayHello("Johan");

        /*
        * static class
        */
        StaticClass.InnerClass innerClass = new StaticClass.InnerClass();
        innerClass.setName("johan from InnerClass in StaticClass");
        System.out.println(innerClass.getName());

        /*
        * static block
        **/
        // System.out.println(StaticBlock.PROCESSORS);
        System.out.println("MY PROCESSORS: "+PROCESSORS);
    }
}
