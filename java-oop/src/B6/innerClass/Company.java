package B6.innerClass;

public class Company {
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public class Employe {
        public String name;

        // inner class can access private properties or method from outer class
        public String getCompanyAddress() {
            return Company.this.address;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
