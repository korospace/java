package A4.methodReference;

public class UtilClass {
    public static boolean isLowerStatic(String name) {
        for (var x:name.toCharArray()) {
            if (!Character.isLowerCase(x)) {
                return false;
            }
        }
        return true;
    }

    public boolean isLowerNonStatic(String name) {
        for (var x:name.toCharArray()) {
            if (!Character.isLowerCase(x)) {
                return false;
            }
        }
        return true;
    }
}
