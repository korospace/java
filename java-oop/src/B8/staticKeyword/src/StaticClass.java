package B8.staticKeyword.src;

public class StaticClass {
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static class InnerClass {
        private String name;

        /*
        * static class can't access outer class
        */
        // public String getOuterAddress() {
        //     return StaticClass.this.address;
        // }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
