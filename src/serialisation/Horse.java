package serialisation;

import java.io.Serializable;
import java.util.Objects;

public class Horse extends Animal implements Serializable {
    String color;
    private Halter halter;

    public Horse(String name, String color, Halter halter) {
        super(name);
        this.color = color;
        this.halter = halter;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Halter getHalter() {
        return halter;
    }

    public void setHalter(Halter halter) {
        this.halter = halter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Horse horse = (Horse) o;
        return Objects.equals(color, horse.color) &&
                Objects.equals(halter, horse.halter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color, halter);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "color='" + color + '\'' +
                ", halter=" + halter +
                "} " + super.toString();
    }
}
