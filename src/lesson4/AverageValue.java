package lesson4;
//Не работает
public class AverageValue {
    public static void main(String[] args) {
        double a = getValue(args[0]);
        double b = getValue(args[1]);
        double c = getValue(args[2]);
        double d = (a + b + c) / 3;
        System.out.println("The average for this numbers " + d);

    }

    private static double getValue(String arg){
        double a = Double.parseDouble(arg);
        System.out.println("String: " + a);
        return a;
    }
}
