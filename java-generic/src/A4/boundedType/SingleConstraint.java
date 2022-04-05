package A4.boundedType;

public class SingleConstraint {
    public static void main(String[] args) {
        Company<Integer> dataInt = new Company<>(123);
        Company<Long> dataLong = new Company<>(1l);

        //Company<String> dataString = new Company<String>("tes"); // ERROR
    }

    /*
    * only extends one class.
    * if you want more, extends the interface
    */
    public static class Company <N extends Number> {
        private N data;

        public Company(N data) {
            this.data = data;
        }

        public N getData() {
            return data;
        }

        public void setData(N data) {
            this.data = data;
        }
    }
}
