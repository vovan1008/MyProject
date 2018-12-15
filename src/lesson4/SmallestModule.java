package lesson4;

import java.util.Scanner;

public class SmallestModule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int a = getValue(sc);
        System.out.println("Please enter second number: ");
        int b = getValue(sc);
        System.out.println("Please enter third number: ");
        int c = getValue(sc);
        int am = a < 0 ? -a : a;
        int bm = b < 0 ? -b : b;
        int cm = c < 0 ? -c : c;
        getSmall(am,bm,cm);

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
    private static void getSmall(int am,int bm,int cm) {
        if(am < bm & am < cm){
            System.out.println("The smallest of entered numbers is: "+ am);
        } else if (bm < am & bm < cm){
            System.out.println("The smallest of entered numbers is: " + bm);
        } else if (cm < am & cm < bm){
            System.out.println("The smallest of entered numbers is: " + cm);
        }
    }

}
