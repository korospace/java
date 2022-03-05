public class TypeDataArray {
    public static void main(String[] args) {
        String[] arrayName;
        arrayName = new String[2];

        int[] arrayAge = new int[2];
        arrayAge[0] = 22;

        long[] arrayLong = new long[]{
                1,2,3,4
        };

        Byte[] arrayByte = {
                1,2,3,4
        };

        System.out.println(arrayAge[0]);
        System.out.println(arrayLong[3]);
        System.out.println(arrayByte.length);

        /*
        * Array In Array
        */
        String[][] student = {
                {"johan","jihan","wahyu"},
                {"luna","ariel"}
        };

        System.out.println(student[0][1]);
        System.out.println(student[1][1]);
    }
}
