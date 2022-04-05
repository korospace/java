package A6.typeErasur;

public class App {
    public static void main(String[] args) {
        MyData dataStr = new MyData("tes");

        MyData<Integer> dataInt = (MyData<Integer>) dataStr;

        System.out.println(dataInt.getData()); // out: tes

        Object yy = dataInt.getData();

        System.out.println(yy); // out: tes

        Integer xx = dataInt.getData(); // ERROR when compile no runtime
    }
}
