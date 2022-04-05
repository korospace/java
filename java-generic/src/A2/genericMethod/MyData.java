package A2.genericMethod;

public class MyData {
    public static <T> Integer countElement(T[] data) {
        return data.length;
    }

    public static <T> Boolean isString(T data) {
        if (data instanceof String) {
            return true;
        }

        return false;
    }
}
