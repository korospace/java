package B7.propertiesClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class App {
    public static void main(String[] args) {
        // read properties file
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("myconf.properties"));

            System.out.println("db host:"+properties.getProperty("database.host"));
            System.out.println("db name:"+properties.getProperty("database.name"));
        } catch(FileNotFoundException e) {
            System.out.println("file not found:"+e);
        } catch(IOException e) {
            System.out.println("file not load:"+e);
        }

        // write properties file
        try {
            Properties properties = new Properties();

            properties.put("name","bagaskoro");
            properties.put("age","20");
            properties.store(new FileOutputStream("student.properties"),"biodata");

        } catch(FileNotFoundException e) {
            System.out.println("file not found:"+e);
        } catch(IOException e) {
            System.out.println("file not load:"+e);
        }
    }
}
