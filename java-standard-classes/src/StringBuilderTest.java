public class StringBuilderTest {
    public static void main(String[] args) {
        /*
         * StringBuffer: thread save
         * StringBuilder: non thread save
         *
         * StringBuilder fastes then StringBuffer
         */

        StringBuffer name = new StringBuffer();
        // StringBuilder name = new StringBuilder();

        name.append("Muhammad ");
        name.append("Akbar ");
        name.append("Bagaskoro");

        System.out.println(name.toString());
    }
}
