package A4.boundedType;

public class MultipleConstraint {
    public static void main(String[] args) {
        // AppFamily<Child> child = new AppFamily<>(new Child()); // ERROR: not implement SayHello

        AppFamily<StepChild> stepChild = new AppFamily<>(new StepChild());
    }

    // Interface
    public static interface SayHello {
        public void sayHello(String name);
    }

    // Abstract
    public static abstract class Mother { }

    // Child
    public static class Child extends Mother {

    }

    // Step Child
    public static class StepChild extends Mother implements SayHello {
        @Override
        public void sayHello(String name) {
            System.out.println("hi "+name);
        }
    }

    public static class AppFamily<T extends Mother & SayHello> {
        private T data;

        public AppFamily(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}
