public class TypeDataNumber {

    public static void main(String[] args) {
        /*
        * Integer
        */
        byte iniByte = 127;
        short iniShort = 32767;
        int iniInt = 2147483647;
        long iniLongL = 923337203685477580L; // L/l

        /*
        * Floating point number
        */
        float iniFloat = 10.10F; // F/f
        double iniDouble = 10.10;

        /*
        * Literals
        */
        int decimalInt = 25;
        int hexaDecimal = 0xFFF; // harus diawali 0x
        int binaryDecimal = 0b101010101; // harus diawali 0b

        /*
        * Underscore
        */
        int mount1 = 1000_000_000;
        long mount2 = 1000_000_000_000L;

        /*
        * Konversi Type Data
        * 1. Widening Casting (otomatis)
        *    byte->short->int->long->float->double
        * 2. Narrowing Casting (manual)
        *    double->float->long->int->short->byte
        *    * bisa terkena number overflow
        */

        // Widening
        byte iniByteX = 10;
        short iniShortX = iniByteX;
        // Narrowing
        long iniLongX = 1000000000;
        byte iniByteY = (byte) iniLongX;

        System.out.println(iniByteY);
    }

}
