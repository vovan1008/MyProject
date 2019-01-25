package lesson10.task4;

public class Skirt extends Cloth implements WomensCloth {
    public Skirt() {
    }

    @Override
    public void putOnWomensCloth() {
        System.out.println("Skirt");
    }
}
