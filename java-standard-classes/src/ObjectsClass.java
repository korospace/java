import java.util.Objects;

public class ObjectsClass {
    public static void main(String[] args) {

        class Data {
            private String name;

            Data(String name) {
                this.name = name;
            }

            @Override
            public int hashCode() {
                return name != null ? name.hashCode() : 0;
            }

            @Override
            public String toString() {
                return "Data{" +
                        "name='" + name + '\'' +
                        '}';
            }
        }

        execute1(new Data("Bagaskoro")); // with Objects class
        execute2(null);                   // without Objects class
    }

    public static void execute1(Object data) {
        System.out.println(Objects.toString(data));
        System.out.println(Objects.hashCode(data));
    }

    public static void execute2(Object data) {
        //System.out.println(data.toString()); // Error: nullPointerException
        //System.out.println(data.hashCode()); // Error: nullPointerException

        if (data != null) {
            System.out.println(data.toString());
            System.out.println(data.hashCode());
        }
    }
}
