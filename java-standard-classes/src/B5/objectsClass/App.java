package B5.objectsClass;

import java.util.Objects;

public class App {
    static class Data {
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

    public static void main(String[] args) {
        execute1(new Data("Bagaskoro")); // with Objects class
        execute2(null);                   // without Objects class
    }

    public static void execute1(Data data) {
        System.out.println(Objects.toString(data));
        System.out.println(Objects.hashCode(data));
    }

    public static void execute2(Data data) {
        //System.out.println(data.toString()); // Error: nullPointerException
        //System.out.println(data.hashCode()); // Error: nullPointerException

        if (data != null) {
            System.out.println(data.toString());
            System.out.println(data.hashCode());
        }
    }
}
