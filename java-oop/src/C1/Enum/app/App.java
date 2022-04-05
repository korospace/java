package C1.Enum.app;

import C1.Enum.src.CustomerLevel;

public class App {
    public static void main(String[] args) {
        Customer customer = new Customer();

        customer.levelCustomer = CustomerLevel.VIP;

        System.out.println("cus level: "+customer.levelCustomer);
        System.out.println("level desc: "+customer.levelCustomer.description);
        System.out.println("level price: "+customer.levelCustomer.getPrice());

        /*
        * Convert Enum To String
        */
        // customer.xx = CustomerLevel.STANDART; // Error, type data must be enum class
        customer.xx = CustomerLevel.STANDART.name();
        System.out.println(customer.xx);

        /*
        * Convert String To Enum
        */
        // CustomerLevel xxLevel = CustomerLevel.valueOf("COBA_COBA"); // Error, because COBA_COBA not in enum class
        CustomerLevel xxLevel = CustomerLevel.valueOf("PREMIUM");
        System.out.println(xxLevel);

        /*
        * Show All Enum Members
        */
        CustomerLevel[] arrayLevel = CustomerLevel.values();
        System.out.println("Enum Members:");
        for(var x:arrayLevel) {
            System.out.println(x);
        }
    }
}
