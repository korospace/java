package A1.membuatLamda;

public class App {
    public static void main(String[] args) {
        MyLamda myLamda1 = new MyLamda() {
            @Override
            public String action() {
                return "BAGASKORO";
            }
        };

        System.out.println(myLamda1.action());

        MyLamda myLamda2 = () -> {
            return "BAGASKORO";
        };

        System.out.println(myLamda2.action());
    }
}
