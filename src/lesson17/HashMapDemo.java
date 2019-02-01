package lesson17;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Toy> map = new TreeMap<>();

        map.put("Doll", new Toy("Doll", 45));
        map.put("Qube", new Toy("Qube", 50));
        map.put("Car", new Toy("Car", 75));
        map.put("Constructor", new Toy("Constructor", 100));

        printKeys(map);
        printValues(map);
        printEntries(map);
    }

    private static void printEntries(Map<String, Toy> map) {
        Set<Map.Entry<String,Toy>> entrySet = map.entrySet();
        for (Map.Entry<String,Toy> entry : entrySet){
            System.out.println("Key: " + entry.getKey());
            System.out.println("Value: " + entry.getValue());
        }
    }

    private static void printValues(Map<String, Toy> map) {
        Collection<Toy> values =  map.values();
        System.out.println(values);
    }

    private static void printKeys(Map<String, Toy> map){
        Set<String> keys = map.keySet();
        System.out.println(keys);
    }
}
