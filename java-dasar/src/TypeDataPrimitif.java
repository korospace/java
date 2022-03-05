public class TypeDataPrimitif {
    public static void main(String[] args) {
         /*
         * Type Data Primitif adalah type data bawaan tiap bahasa.
         * Setiap type data primitif memiliki type data BUKAN primitif-nya.
         * Type data primitif bisa bernilai null.
         * String bukan primitif.
         */

        Byte iniByte = 127;
        Short iniShort = 1000;
        Integer iniInt = 10000;
        Long iniLong = 100000l;

        Float iniFloat = 10.2f;
        Double iniDouble = 20.2;

        Character iniChar = 'h';
        Boolean benar = true;

        /*
        * Konversi
        */
        int age1 = 22;
        Integer age2 = age1;

        byte tesByte = age2.byteValue();
        long tesLong = age2.longValue();

        System.out.println(tesByte);
        System.out.println(tesLong);
    }
}
