package lesson16;

import boximport.HeavyBox;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        SortedSet<HeavyBox> set = new TreeSet<>();
        set.add(new HeavyBox(1,2,3,4));
        set.add(new HeavyBox(7,7,7,7));
        set.add(new HeavyBox(3,3,3,3));
        set.add(new HeavyBox(2,2,2,2));
        set.forEach(box -> System.out.println(box.weight));

    }
}
