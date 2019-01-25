package lesson10.task4;

public abstract class Cloth {
  Size size;
  double price;
  String color;

    public Cloth(Size size, double price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public Cloth() {
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
