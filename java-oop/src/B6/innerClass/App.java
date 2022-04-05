package B6.innerClass;

public class App {
    public static void main(String[] args) {
        Company company = new Company();
        company.setAddress("Cendana residence B1 No.2");

        Company.Employe employe = company.new Employe();
        System.out.println(employe.getCompanyAddress());
    }
}
