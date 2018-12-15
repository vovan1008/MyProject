package lesson4;

public class Garland {
    public static void main(String[] args) {
        int garland = 61;
        System.out.println(Integer.toBinaryString(garland));
        blink(garland);
        firstLamp(garland);
        runningLine(garland);
    }

    private static void blink(int garland) {
        int b = ~garland;
        System.out.println(Integer.toBinaryString(b));
    }

    private static void firstLamp(int garland) {
        int c = 1;
        int f = c & garland;
        if (f == 1) {
            System.out.println("First lamp is on");
        } else {
            System.out.println("First lamp is off");
        }
    }

    private static void runningLine(int garland) {
        int r = garland << 2;
        System.out.println(Integer.toBinaryString(r));
    }
}
