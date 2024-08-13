package if_else;

import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int secretNumber = 7;

        int i = 0;
        while (i < 3) {
            i++;

        System.out.println("Guess number between 0 and 9 ");
        int answer = scanner.nextInt();


            if (answer == secretNumber) {
                System.out.println("You have guessed the secret number");
            } else {
                System.out.print("Sorry the number  ");

                if (answer < secretNumber)
                    System.out.println("is too small");
                else System.out.println("is too high");
            }

        }
    }
}
