package A1.stringClass;

public class App {
    public static void main(String[] args) {
        String name = "Muhammad Akbar Bagaskoro";
        String lowerCase = name.toLowerCase();
        String upperCase = name.toUpperCase();

        System.out.println(name);
        System.out.println(lowerCase);
        System.out.println(upperCase);
        System.out.println(name.length()); // 24
        System.out.println(name.charAt(2));// h
        System.out.println(name.startsWith("muh")); // false
        System.out.println(name.endsWith("koro"));  // true
        System.out.println(" ".isBlank()); // true
        System.out.println(" ".isEmpty()); // false

        String[] nameSplit = name.split(" ");
        for (var value:nameSplit) {
            System.out.println(value);
        }

        char[] nameChars = name.toCharArray();
        for (var value:nameChars) {
            System.out.print(value+" ");
        }
    }
}
