package internetStore;

import java.util.Arrays;

public class Basket {
    Product[] products;

    public Basket(Product... product) {
        product = new Product[product.length];
        for (int i = 0; i < product.length; i++) {
            products[i] = product[i];
        }
    }
    public Basket(){

    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "products=" + Arrays.toString(products) +
                '}';
    }

    public static void main(String[] args) {
        Product iphone = new Product("Iphone Xr 64gb", 800, 4.7);
        Product macbook = new Product("Macbook pro 13 128gb", 1300, 4.8);
        Product watch = new Product("Apple watch series 3", 350, 4.6);
        Product airpods = new Product("AirPods", 250, 4.8);
        Product phoneCase = new Product("Iphone leather case",20,4.5);
        Product macbookSkin = new Product("Macbook lesther skin",50,4.4);
        Product magicMouse = new Product("Magic mouse",50,4.6);
        Basket basket1 = new Basket(iphone,airpods);
        Basket basket2 = new Basket(macbook,macbookSkin,magicMouse);

        System.out.println(basket1.toString());
        System.out.println(basket2.toString());
    }
}
