package closeResource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
//        manualCLoseSource();
        autoCloseResource();
    }

    /*
    * Manual CLose Resource
    */
    public static void manualCLoseSource() {
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader("README.md"));

            while(true) {
                String line = bufferedReader.readLine();

                if (line == null){
                    break;
                }

                System.out.println(line);
            }
        } catch(Throwable e) {
            System.out.println("Error file reader: "+e.getMessage());
        } finally {
            try {
                bufferedReader.close();
            } catch(IOException e) {
                System.out.println("Error whenl closing bufferedReader");
                e.printStackTrace();
            }
        }
    }

    /*
    * Non-manual Close Resource
    */
    public static void autoCloseResource() {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("README.md"))) {
            while (true){
                String line = bufferedReader.readLine();

                if (line == null){
                    break;
                }

                System.out.println(line);
            }
        } catch (Throwable e) {
            System.out.println("Error read file: "+e.getMessage());
        }
    }
}
