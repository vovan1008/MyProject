package boximport;


public class Box {
    double width;
    double height;
    double depth;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    @Override
    public String toString() {
        return "Box{" +
                "width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                '}';
    }

    // подсчитать объем коробки
    double getVolume() {
        return width * height * depth;
    }

    // установить размер коробки
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}
