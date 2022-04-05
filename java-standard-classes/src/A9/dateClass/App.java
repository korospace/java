package A9.dateClass;

import java.util.Calendar;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        Date date1 = new Date();
        System.out.println(date1);

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DATE,03);
        calendar.set(Calendar.MONTH,9); // october
        calendar.set(Calendar.YEAR,2000);

        Date result = calendar.getTime();
        System.out.println(result);
    }
}
