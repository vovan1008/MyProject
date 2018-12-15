package lesson3;

import java.util.Scanner;
// Есть проблемма при вводе не целого числа выдает ошибку

public class OddEven {
    public static void main(String[] args) {
        System.out.println("Please enter number");
        Scanner scan = new Scanner(System.in);
        int num = getVal(scan);
        int check = num % 2;
        getEvenOrOdd(check);

    }

    private static void getEvenOrOdd(int check) {
        if (check == 0) {
            System.out.println("Your number is even!");
        } else {
            System.out.println("Your number is odd");
        }
    }

    private static int getVal(Scanner scan) {
        if (scan.hasNextInt()) {
            int i = scan.nextInt();
            return i;
        } else {
            System.out.println("Entered number is not integer");
            System.exit(0);
            return 0;
        }
    }
}


