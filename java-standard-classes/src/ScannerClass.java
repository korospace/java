import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("name: ");
        String name = scanner.nextLine();

        System.out.print("age: ");
        int age = scanner.nextInt();

        System.out.println("My name is "+name+", i am "+age+" years old");
    }
}
