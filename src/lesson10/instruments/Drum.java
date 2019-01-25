package lesson10.instruments;

import java.util.Objects;
import java.util.Formatter;

public class Drum implements Instrument {
  private String size;

    public Drum(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.printf("Playing %s drum",getSize());
        System.out.println();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drum drum = (Drum) o;
        return Objects.equals(size, drum.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size);
    }
}
