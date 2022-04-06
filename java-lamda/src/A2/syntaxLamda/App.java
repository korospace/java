package A2.syntaxLamda;

public class App {
    public static void main(String[] args) {
        MyLamda myLamda1 = (String name) -> {
            return "Hallo "+name;
        };
        System.out.println(myLamda1.action("bagas1"));

        MyLamda myLamda2 = (name) -> {
            return "Hallo "+name;
        };
        System.out.println(myLamda2.action("bagas2"));

        MyLamda myLamda3 = (name) -> "Hallo "+name;
        System.out.println(myLamda3.action("bagas3"));

        MyLamda myLamda4 = name -> "Hallo "+name;
        System.out.println(myLamda4.action("bagas4"));
    }
}
