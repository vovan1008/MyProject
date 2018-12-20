package lesson8.task4;

import java.util.Arrays;

public class Bouquet {

    private Flower bouquet[];
    public static int count;

    public void setBouquet(Flower... flowers) {
        count +=flowers.length;
        this.bouquet = new Flower[flowers.length];

        System.arraycopy(flowers, 0, bouquet, 0, flowers.length);

    }

    public void getCost() {
        int sum = 0;
        for (Flower flower : bouquet) {
            sum += flower.getPrice();
        }
        System.out.println("Sum = "+sum);
    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "bouquet=" + Arrays.toString(bouquet) +
                '}';
    }

    public static void main(String[] args) {
        Roses roses = new Roses("Italy", 14, 35);
        Tulips tulips = new Tulips("Holland", 10, 30);
        Carnations carnations = new Carnations("Russia", 10, 20);
        Lilies lilies = new Lilies("Ukraine", 7, 60);

        Bouquet bouquet1 = new Bouquet();
        Bouquet bouquet2 = new Bouquet();
        Bouquet bouquet3 = new Bouquet();

        bouquet1.setBouquet(roses, tulips, carnations);
        bouquet2.setBouquet(lilies, tulips, roses);
        bouquet3.setBouquet(lilies, lilies, lilies, tulips, tulips);

        bouquet1.getCost();
        bouquet2.getCost();
        bouquet3.getCost();

        System.out.println(bouquet1.toString());
        System.out.println(bouquet2.toString());
        System.out.println(bouquet3.toString());

        System.out.println("qty of selled flowers "+Bouquet.count);


    }


}



