package lesson12;

import java.util.Formatter;

public class StringFormat {
    public static void main(String[] args) {
        formatString("Kudinov", 75,"Math");
        formatString("Ivanov", 70,"Electronics");

        }
        private static void formatString(String fullname, int mark, String subject){
            System.out.printf("Student %15S got %3d in %10s%n",fullname , mark, subject);
        }


}
