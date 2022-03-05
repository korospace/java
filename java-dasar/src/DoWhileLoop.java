public class DoWhileLoop {
    public static void main(String[] args) {
        /*
        * counter dijalankan paling tidak sekali
        * walaupun kondisi nya tidak terpenuhi
        */
        int counter = 1;

        do {
            System.out.println(counter);
            counter++;
        } while (counter < 10);
    }
}
