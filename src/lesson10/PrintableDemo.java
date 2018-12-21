package lesson10;

public class PrintableDemo {
    public static void main(String[] args) {
        Printable book1 = new Book("Encyclopedia");
        Printable book2 = new Book("Fairytales");
        Magazine magazine1 = new Magazine("Auto world");

        Printable[] printables = {book1, book2, magazine1};
        for (Printable printable : printables) {
            printable.print();
        }
    }
}
