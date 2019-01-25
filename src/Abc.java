import java.util.Objects;

public class Abc {
    private int a;

    public Abc(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Abc abc = (Abc) o;
        return a == abc.a;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a);
    }
}
