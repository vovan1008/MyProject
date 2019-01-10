package lesson11;

public class ShortDemo {
    public static void main(String[] args) {
        Double double1 = 7.0;
        Double double2 = new Double("8.4");
        Double double3 = Double.valueOf(34657.556);
        Double double4 = Double.valueOf("5.6");
        Double double5 = Double.parseDouble("4.2");

        System.out.println(double1);
        System.out.println(double2);
        System.out.println(double3);
        System.out.println(double4);
        System.out.println(double5);

        System.out.println(double3.byteValue());
        System.out.println(double3.shortValue());
        System.out.println(double3.intValue());
        System.out.println(double3.longValue());
        System.out.println(double3.floatValue());

    }
}
