import java.io.File;
import java.nio.file.Files;
import java.util.Base64;

public class Base64Class {
    public static void main(String[] args) {
        String name = "Muhammad Akbar Bagas";

        // encode
        String nameEncode = Base64.getEncoder().encodeToString(name.getBytes());
        System.out.println(nameEncode);

        // decode
        byte[] nameBytes = Base64.getDecoder().decode(nameEncode);
        String nameDecode = new String(nameBytes);
        System.out.println(nameDecode);

        try {
            File fi = new File("soal4.png");
            byte[] fileImg = Files.readAllBytes(fi.toPath());

            String imgEncode = Base64.getEncoder().encodeToString(fileImg);
            System.out.println(imgEncode);
        } catch (Throwable e) {
            System.out.println("error: "+e);
        }
    }
}
