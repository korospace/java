package A7.bigNumberClass;

import java.math.BigInteger;

public class App {
    public static void main(String[] args) {
        //BigDecimal a = new BigDecimal("2000.22");
        BigInteger b = new BigInteger("1000000000");
        BigInteger c = new BigInteger("3000000000");

        BigInteger result = b.add(c);
        System.out.println(result);
    }
}
