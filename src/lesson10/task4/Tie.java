package lesson10.task4;

public class Tie extends Cloth implements MensCloth {
    public Tie() {
    }

    @Override
    public void putOnMenCloth() {
        System.out.println("Tie");
    }
}
