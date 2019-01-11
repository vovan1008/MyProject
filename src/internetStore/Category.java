package internetStore;

import java.util.Arrays;
import java.util.Objects;

public class Category {
    private String categoryName;
    Product[] products;

    public Category(String categoryName, Product... product) {
        products = new Product[product.length];
        for (int i = 0; i < product.length; i++) {
            products[i] = product[i];
        }
    }


    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
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
        return categoryName.equals(category.categoryName) &&
                Arrays.equals(products, category.products);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(categoryName);
        result = 31 * result + Arrays.hashCode(products);
        return result;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryName='" + categoryName + '\'' +
                ", products=" + Arrays.toString(products) +
                '}';
    }

    public static void main(String[] args) {
        Product iphone7 = new Product("iphone 7", 600.0, 4.6);
        Product iphone8 = new Product("iphone 8", 700.0, 4.7);
        Product iphoneX = new Product("iphone X", 900.0, 4.6);
        Product macbookPro13 = new Product("macbook Pro 13", 1200.0, 4.9);
        Product macbookPro15 = new Product("macbook Pro 15", 2400.0, 4.9);
        Product macbookAir = new Product("macbook Air", 1299.0, 5.0);
        Category smartphones = new Category("Iphones", iphone7, iphone8, iphoneX);
        Category laptops = new Category("MacBooks", macbookPro13, macbookPro15, macbookAir);

        System.out.println(smartphones.toString());
        System.out.println(laptops.toString());


    }
}
