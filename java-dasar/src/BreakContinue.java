public class BreakContinue {
    public static void main(String[] args) {
        /*
        * Break
        */
        int count1 = 1;

        while(true) {
            if (count1 >= 10){
                break;
            }
            count1++;
        }

        System.out.println("break: "+count1);

        /*
        * Countinue
        * kode program dibawah continue akan di skip dan lanjut ke perulangan selanjutnya
        */

        for (int count2 = 1;count2 <= 10;count2++) {
            if (count2 % 2 == 0) {
                continue;
            }
            System.out.println(count2);
        }
    }
}
