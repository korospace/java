package B9.regexClass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        String name = "Muhammad Akbar Bagas koro";

        Pattern pattern = Pattern.compile("[a-zA-Z]*[a][a-zA-Z]*");

        Matcher matcher = pattern.matcher(name);

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
