package lesson12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Student on 14.01.2019.
 */
public class FindJavaVersion {
    public static void main(String[] args) {
        String regex = "java\\s+\\d{1,2}";
        String s = "Versions: java 5, java 6, java  7,java 8, java 11.";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            System.out.println("Version " + matcher.group());
        }
    }
}
