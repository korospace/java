package A1.genericClass;

public class App {
    public static void main(String[] args) {
        MyData<String> dataString = new MyData<String>("tes123");
        MyData<Integer> dataInt = new MyData<Integer>(123);

        System.out.println(dataString.getData());
        System.out.println(dataInt.getData());
    }
}
