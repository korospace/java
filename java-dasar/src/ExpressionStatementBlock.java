import java.util.Date;

public class ExpressionStatementBlock {
    public static void main(String[] args) {
        boolean isAdmin; // expresiion OR statement
        isAdmin = false; // expresiion OR statement

        /*
        * Statement
        * -> kumpulan expression
        *
        * System.out.println(isAdmin = true);
        *                    |____________|
        *                       expression
        * |_________________________________|
        *           statement
        */

        // assigment statement
        int age = 22;
        // increment statement
        age++;
        // method invocation statement
        System.out.println(age);
        // object creation statement
        Date date = new Date();

        /*
        * Block
        * ->kumpulan statement
        */
        {

        }
    }
}
