package C2.Exception;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        /*
        * Checked Exception
        * must use try catch
        */
        LoginRequest loginRequest = new LoginRequest("tes","tes");

        try {
            ValidationUsingChecked.validateLogin(loginRequest);
            System.out.println("Login Success");
        } catch(ExceptionChecked | NullPointerException e) {
            System.out.println("Error: "+e.getMessage());
        } finally {
            System.out.println("login finish");
        }

        System.out.println("======================");

        /*
        * Runtime exception
        * no need to use try catch, but can use
        */
        LoginRequest loginRequest2 = new LoginRequest("tes",null);

        try {
            ValidationUsingRuntime.validateLogin(loginRequest2);
        } catch(ExceptionRuntime e) {
            System.out.println("runtime exception:"+e.getMessage());
        } catch(NullPointerException e) {
            System.out.println("runtime exception:"+e.getMessage());
        }

        System.out.println("======================");

        /*
        * Error exception
        * better not use try catch, turn off the app!
        */
        try {
            connectDatabase("tes","");
        } catch(Throwable e) {
            System.out.println("db error:"+e.getMessage());
        }

        System.out.println("======================");

        /*
        * StackTrace
        */
        try {
            String[] students = {
                    "bagas","koro","akbar"
            };

            System.out.println(students[100]);
        } catch(Throwable e) {

            System.out.println(e);

            StackTraceElement[] stackTraceElements = e.getStackTrace();

            for (var x:stackTraceElements) {
                System.out.println(x);
            }

            e.printStackTrace();
        }
    }

    static void connectDatabase(String username, String password) {
        if (username.isBlank() || password.isBlank()) {
            throw new ExceptionRuntime("failed connect to database");
        }
    }
}
