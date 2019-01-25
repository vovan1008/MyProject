package lesson10.instruments;

import java.util.Objects;
import java.util.Formatter;

public class Guitar implements Instrument {
  private int numOfStrings;

    public Guitar(int numOfStrings) {
        this.numOfStrings = numOfStrings;
    }

    public int getNumOfStrings() {
        return numOfStrings;
    }

    public void setNumOfStrings(int numOfStrings) {
        this.numOfStrings = numOfStrings;
    }

    @Override
    public void play() {
        System.out.printf("Playing guitar with %d strings",getNumOfStrings());
        System.out.println();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Guitar guitar = (Guitar) o;
        return numOfStrings == guitar.numOfStrings;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numOfStrings);
    }

}
