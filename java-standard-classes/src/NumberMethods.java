public class NumberMethods {
    public static void main(String[] args) {
        Integer integerVal = 1000;

        Double doubleVal = integerVal.doubleValue();
        Float floatVal = integerVal.floatValue();

        System.out.println(doubleVal);
        System.out.println(floatVal);

        /*
        * Konversi String To Number
        */

        String stringVal = "100.10";

        double stringDouble1 = Double.parseDouble(stringVal); // primitive
        Double stringDouble2 = Double.valueOf(stringVal); // non-primitive
        Integer stringInteger = stringDouble2.intValue();

        System.out.println(stringDouble1);
        System.out.println(stringDouble2);
        System.out.println(stringInteger);

    }
}
