package if_else;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

        Scanner ourScanner = new Scanner(System.in);
        System.out.println("Entered number");

        int num = ourScanner.nextInt();

        if (num < 0) {
            System.out.println("The number is negative");
        }
        if (num > 0) {
            System.out.println("The number is positive");
        }
        if (num == 0) {
            System.out.println("The number is 0");
        }

        ourScanner.close();
    }


}
