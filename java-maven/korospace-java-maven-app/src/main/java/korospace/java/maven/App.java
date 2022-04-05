package korospace.java.maven;

import com.google.gson.Gson;

public class App 
{
    public static void main( String[] args )
    {
        Gson gson = new Gson();
        Person person = new Person("Muhammad Akbar Bagaskoro");

        String json = gson.toJson(person);
        System.out.println(json);
    }
}
