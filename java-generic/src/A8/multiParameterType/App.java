package A8.multiParameterType;

public class App {
    public static void main(String[] args) {
        Mydata<String,Boolean> data = new Mydata<String,Boolean>("tes123",true);

        System.out.println(data.getFirstPropertiy());
        System.out.println(data.getSecondProperty());
    }
}
