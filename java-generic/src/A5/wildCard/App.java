package A5.wildCard;

public class App {
    public static void main(String[] args) {
        MyData<String> dataStr = new MyData<>("tes123");
        MyData<Integer> dataInt = new MyData<>(123);

        doIt(dataStr);
        doIt(dataInt);
    }

    public static void doIt(MyData<?> data) {
        Object o = data;
        System.out.println(o);
    }
}
