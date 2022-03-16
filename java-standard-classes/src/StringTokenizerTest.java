import java.util.StringTokenizer;

public class StringTokenizerTest {
    public static void main(String[] args) {
        String name = "Muhammad Akbar Bagaskoro";
        StringTokenizer tokenName = new StringTokenizer(name," ");

        while(tokenName.hasMoreTokens()){
            System.out.println(tokenName.nextToken());
        }
    }
}
