package internetStore;

import java.util.Arrays;
import java.util.Objects;

public class Category {
    private String name;
    Product[] products;

    public Category(String name, Product[] products) {
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return name.equals(category.name) &&
                Arrays.equals(products, category.products);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name);
        result = 31 * result + Arrays.hashCode(products);
        return result;
    }

    public static void main(String[] args) {
        Category food = new Category();
    }
}
