package B9.records;

public class App {
    public static void main(String[] args) {
        LoginRecord login = new LoginRecord("bagas","123");

        System.out.println(login);
        System.out.println(login.username());
        login.sayHello();

        LoginRecord login2 = new LoginRecord();
        LoginRecord login3 = new LoginRecord("johan");
    }
}
