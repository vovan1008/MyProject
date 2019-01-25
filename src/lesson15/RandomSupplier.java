package lesson15;

import java.util.function.Supplier;

public class RandomSupplier {
    public static void main(String[] args) {

        Supplier<Integer> supplier = () -> (int) (Math.random()*10);
        System.out.println(supplier.get());
    }
}
