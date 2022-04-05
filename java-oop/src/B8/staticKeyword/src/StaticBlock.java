package B8.staticKeyword.src;

public class StaticBlock {
    public static final Integer PROCESSORS;

    /*
    * Static block can access static properties/methods
    */
    static {
        System.out.println("static block is running");
        PROCESSORS = Runtime.getRuntime().availableProcessors();
    }
}
