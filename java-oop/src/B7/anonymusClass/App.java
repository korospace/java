package B7.anonymusClass;

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

        MyAbstract myAbstract = new MyAbstract() {
            private String name;

            @Override
            public void setName(String name) {
                this.name = name;
            }

            @Override
            public String getName() {
                return this.name;
            }
        };

        myAbstract.setName("lala");
        System.out.println(myAbstract.getName());
    }
}
