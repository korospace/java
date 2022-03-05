public class ForLoop {
    public static void main(String[] args) {
        /*
        * for (init statement;kondisi;post statement)
        * init statement, kondisi, post statement semua bersifat opsional
        */

        // for (;;) {
        //     System.out.println("invinite loop");
        // }

        int counter1 = 1;
        for (;counter1 <= 10;) {
            System.out.println("counter1 = "+counter1);
            counter1++;
        }

        for (int counter2 = 1;counter2 <= 4;counter2++) {
            System.out.println("counter2 = "+counter2);
        }
    }
}
