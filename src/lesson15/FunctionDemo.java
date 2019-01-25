package lesson15;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {


        Function<Integer, String> function1 = i -> i > 0 ? "Positive number"
                : i < 0 ? "Negative number"
                : "Zero";
        System.out.println(function1.apply(9));
        System.out.println(function1.apply(-9));
        System.out.println(function1.apply(0));
    }
}