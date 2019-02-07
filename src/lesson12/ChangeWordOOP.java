package lesson12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChangeWordOOP {
    public static void main(String[] args) {
        String regex = "Object-oriented programming";
        StringBuilder s = new StringBuilder("Object-oriented programming is a programming language model organized around objects rather than \"actions\" and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla.");
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        int count = 0;
        for (int i = 0;i<s.length();i++) {
            matcher.find(1);
            count++;
            if (count == 2) {
                System.out.println(s.replace(matcher.start(), matcher.end(), "OOP"));
            }
        }
    }
}
