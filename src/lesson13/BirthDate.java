package lesson13;

import java.time.LocalDate;

public class BirthDate {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1997,8,10);
        System.out.println(birthday.getChronology());
        System.out.println(birthday.getDayOfMonth());
        System.out.println(birthday.getDayOfWeek());
        System.out.println(birthday.getDayOfYear());
        System.out.println(birthday.getEra());
        System.out.println(birthday.getMonth());
        System.out.println(birthday.getMonthValue());
        System.out.println(birthday.getYear());
        LocalDate today = LocalDate.now();
        System.out.println(today.isAfter(birthday));
        System.out.println(today.isBefore(birthday));
        System.out.println(today.isEqual(birthday));
        System.out.println(today.isLeapYear());
        System.out.println(birthday.isLeapYear());

    }
}
