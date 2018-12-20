package lesson8.task4;

public class Flower {
    public String originCountry;
    public int shelfLife, price;

    public Flower(String originCountry, int shelfLife, int price) {
        this.originCountry = originCountry;
        this.shelfLife = shelfLife;
        this.price = price;
    }

    public Flower() {
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public String toString() {
        return "Flower{" +
                "originCountry='" + originCountry + '\'' +
                ", shelfLife=" + shelfLife +
                ", price=" + price +
                '}';
    }
}
