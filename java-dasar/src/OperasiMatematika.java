public class OperasiMatematika {
    public static void main(String[] args) {
        int a = 100;
        int b = 10;

        System.out.println(a+b); // 110
        System.out.println(a-b); // 90
        System.out.println(a*b); // 1000
        System.out.println(a/b); // 10
        System.out.println(a%b); // 0

        /*
        * Augmented Assigment
        * Operasi terhadap diri sendiri
        */
        int c = 100;

        c += 10;
        System.out.println(c); // 110

        c -= 10;
        System.out.println(c); // 100

        c *= 10;
        System.out.println(c); // 1000


        /*
        * Unary operator
        */
        int d = 1;

        d++;
        System.out.println(d); // 2
        d--;
        System.out.println(d); // 1
        System.out.println(!false); // true
    }
}
