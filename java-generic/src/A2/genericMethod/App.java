package A2.genericMethod;

public class App {
    public static void main(String[] args) {
        String[] arrString = {"1","2","3","4"};
        Integer[] arrInt = {1,2,3,4};

        System.out.println(MyData.countElement(arrString));
        System.out.println(MyData.countElement(arrInt));

        System.out.println(MyData.isString(123));
        System.out.println(MyData.isString("123"));
    }
}
