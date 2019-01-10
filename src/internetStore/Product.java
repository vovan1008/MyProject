package internetStore;

import java.util.Objects;

public class Product {
    private String name;
    private double price, ranking;

    public Product(String name, double price, double ranking) {
        this.name = name;
        this.price = price;
        this.ranking = ranking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRanking() {
        return ranking;
    }

    public void setRanking(double ranking) {
        this.ranking = ranking;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 &&
                Double.compare(product.ranking, ranking) == 0 &&
                name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, ranking);
    }

}
