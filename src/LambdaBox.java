import java.util.function.Consumer;

import boximport.HeavyBox;

public class LambdaBox {
    public static void main(String[] args) {


        Consumer<HeavyBox> consumer1 =
                box -> System.out.println("Uploaded box with weight " + box.weight);
        Consumer<HeavyBox> consumer2 =
                box -> System.out.println("Sending box with weight " + box.weight);
        Consumer<HeavyBox> consumer = consumer1.andThen(consumer2);
        consumer.accept(new HeavyBox(2,3,4,5));


    }
}