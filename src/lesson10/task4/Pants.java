package lesson10.task4;

public class Pants extends Cloth implements MensCloth,WomensCloth {
    public Pants() {
    }

    @Override
    public void putOnMenCloth() {
        System.out.println("Men's pants");
    }

    @Override
    public void putOnWomensCloth() {
        System.out.println("Women's pants");
    }
}
