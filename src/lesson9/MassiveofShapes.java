package lesson9;

public class MassiveofShapes {
    public static void main(String[] args) {
        Shape circle1 = new Circle("red", 4, 5, 69);
        Shape circle2 = new Circle("green", 6, 7, 54);
        Shape rectangle1 = new Rectangle("yellow", 2, 4, 6, 7);
        Shape[] shapes = {circle1, circle2, rectangle1};
        for (Shape shape : shapes) {
            shape.draw();
        }
        System.out.println(circle1.equals(circle2));
        System.out.println(circle1.equals(rectangle1));

        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(rectangle1);
    }
}
