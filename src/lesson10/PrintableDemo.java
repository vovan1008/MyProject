package lesson10;

public class PrintableDemo {
    public static void main(String[] args) {
        Printable book1 = new Book("Encyclopedia");
        Printable book2 = new Book("Fairytales");
        Printable book3 = new Book("Harry Potter");
        Printable book4 = new Book("White fang");
        Magazine magazine1 = new Magazine("Auto world");

        Printable[] printables = {book1, book2,book3,book4, magazine1};
        for (Printable printable : printables) {
            printable.print();
        }
        Magazine.printMagazines(printables);
        Book.printBooks(printables);

        Printable newspaper = ()-> System.out.println("Print newspaper");

        Printable[] printables1 = {newspaper, book1,magazine1};
        for(Printable p:printables1){
            p.print();
        }
    }
}
