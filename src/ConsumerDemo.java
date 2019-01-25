import boximport.HeavyBox;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {


        Consumer<HeavyBox> consumer1 =
                box -> System.out.println("Upload box with weight " + box.weight);

        consumer1.accept(new HeavyBox(1, 2, 3, 4));
        consumer1.accept(new HeavyBox(4,5,6,7));
    }
}
