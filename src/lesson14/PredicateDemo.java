package lesson14;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<String> predicate1 = (String s) -> s != null;
        Predicate<String> predicate2 = (String s) -> !s.isEmpty();
        System.out.println(predicate1.test(null));
        System.out.println(predicate1.test(" "));
        System.out.println(predicate1.test("str"));
        System.out.println(predicate2.test(""));
        System.out.println(predicate2.test("str"));
    }
}
