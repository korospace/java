public class Method {
    public static void main(String[] args) {
        // method with parameter
        sayYourName("Bagas");

        // method return value
        System.out.println(concatName("AKBAR","BAGAS"));

        // Method Variable Argument
        System.out.println(countAvg("KoroSenpai",80,90,80,90));

        // Method Overload
        sameMethod();
        sameMethod("Akbar");
        sameMethod("luna",22);

        // Method Recursive
        loopRecursive(10);
        System.out.println(countFactorial(3));
    }

    /*
    * method with parameter/argument
    */
    static void sayYourName(String name) {
        System.out.println("Hello My Name "+name);
    }

    /*
    * method return value
    */
    static String concatName(String firstName, String lastName) {
        return firstName+" "+lastName;
    }

    /*
    * Method Variable Argument
    */
    static String countAvg(String name,int... values) {
        int total = 0;

        for (var value:values) {
            total = total + value;
        }

        int avg = total/values.length;

        return "student with name '"+name+"' have avg = "+avg;
    }

    /*
    * Method Overloading
    */
    static void sameMethod() {
        System.out.println("tes");
    }
    static void sameMethod(String name) {
        System.out.println("my name is "+name);
    }
    static void sameMethod(String name,Integer age) {
        System.out.println("my name is "+name+", my age is "+age);
    }

    /*
    * Method Recursive
    */
    static void loopRecursive(int value) {
        if (value == 1) {
            System.out.println("loop: "+1);
        }
        else {
            System.out.println("loop: "+value);
            loopRecursive(value-1);
        }
    }
    static int countFactorial(int value) {
        if(value == 1) {
            return 1;
        }
        else {
            return value * countFactorial(value-1);
        }
    }
}
