package anonymusClass;

public class App {
    public static void main(String[] args) {
        MyInterface myInterface = new MyInterface() {
            public void sayHello() {
                System.out.println("hello");
            }

            @Override
            public Integer getAge() {
                return 20;
            }
        };

        myInterface.sayHello();
        System.out.println("i'am "+myInterface.getAge()+" years old");
    }
}
