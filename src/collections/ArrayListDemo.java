package collections;

import boximport.HeavyBox;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<HeavyBox> list = new ArrayList<>();
        list.add(new HeavyBox(1, 2, 3, 4));
        list.add(new HeavyBox(3, 4, 5, 6));
        list.add(new HeavyBox(2, 2, 2, 2));
        HeavyBox box = new HeavyBox(4, 5, 6, 7);
        list.add(box);
        System.out.println(list);

        for (HeavyBox heavyBox : list) {
            System.out.println("Box with volume: " + heavyBox.getWidth() * heavyBox.getHeight() * heavyBox.getDepth() + " and weight:" + heavyBox.weight);
        }
        HeavyBox box2 = list.get(0);
        box2.weight += 1;
        for(HeavyBox heavyBox : list){
            System.out.println(heavyBox.weight);
        }
        list.remove(list.size()-1);
        System.out.println("Size "+list.size());

list.clear();
        System.out.println(list);
    }
}
