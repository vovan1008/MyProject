package lesson3;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two integers");
        int a = getValue(sc);
        int b = getValue(sc);
        System.out.println("Sum of two integers = " + (a + b));

    }

    private static int getValue(Scanner sc) {
        if (sc.hasNextInt()) {
            int i = sc.nextInt();
            return i;
        } else {
            System.out.println("Entered number is not integer");
            System.exit(0);
            return 0;

        }
    }

}
