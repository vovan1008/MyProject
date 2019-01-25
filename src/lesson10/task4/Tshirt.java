package lesson10.task4;

public class Tshirt extends Cloth implements MensCloth,WomensCloth {

    public Tshirt() {
    }

    @Override
    public void putOnMenCloth() {
        System.out.println("Men's T-shirt");
    }

    @Override
    public void putOnWomensCloth() {
        System.out.println("Women's T-shirt");
    }


}
