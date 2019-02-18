package serialisation;

import java.io.Serializable;
import java.util.Objects;

public class Halter implements Serializable {
    private int size;

    public Halter(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Halter halter = (Halter) o;
        return size == halter.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size);
    }

    @Override
    public String toString() {
        return "Halter{" +
                "size=" + size +
                '}';
    }
}
