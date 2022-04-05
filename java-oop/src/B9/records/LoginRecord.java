package B9.records;

/*
* if you need a class there are only methods
* Record class can't exteds to parent but can using implement
*/
public record LoginRecord(String username,String password) {
    public LoginRecord {
        System.out.println("main constructor");
    }

    /*
    * constructor overload
    */
    public LoginRecord() {
        this("","");
        System.out.println("this is 2nd constructor");
    }
    public LoginRecord(String username) {
        this("","");
        System.out.println("this is 3rd constructor");
    }

    // still create method
    public void sayHello() {
        System.out.println("Hello my name is "+this.username());
    }
}
