package A3.invariant;

public class App {
    public static void main(String[] args) {
        MyData<String> dataString = new MyData<>("tes");
        //MyData<Object> dataObj = dataString; // ERROR
        //funcObj(dataString); // ERROR

        MyData<Object> dataObj = new MyData<>(123);
        //MyData<Integer> dataInt = dataObj; // ERROR
        //funcStr(dataObj); // ERROR

        /*
        * COVARIANT
        * - read only
        */
        MyData<? extends Object> tesObj = dataString;
        covariantObj(dataString);

        /*
        * CONTRA VARIANT
        * - read & write not save while read data
        */
        MyData<? super String> tesString = dataObj;
        contraVariantString(dataObj);
    }

    public static void funcObj(MyData<Object> data){

    }

    public static void funcStr(MyData<String> data){

    }

    public static void covariantObj(MyData<? extends Object> data){
        System.out.println(data.getData());
        //data.setData("tes"); // ERROR: setter disallowed in covariant
    }

    public static void contraVariantString(MyData<? super String> data) {
        //String xx = (String) data.getData(); // Not-Safe
        Object xx = data.getData(); // it doesn't matter what type of data you use

        System.out.println(xx);

        data.setData("set data from contra variant");
    }
}
