package lesson16;

import boximport.HeavyBox;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        Queue<HeavyBox> queue = new ArrayDeque<>();
        queue.offer(new HeavyBox(1, 1, 1, 1));
        queue.offer(new HeavyBox(7, 7, 7, 7));
        queue.offer(new HeavyBox(3, 3, 3, 3));
        queue.forEach(box -> System.out.println(queue.poll()));
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
