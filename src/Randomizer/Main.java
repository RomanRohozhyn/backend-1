package Randomizer;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number for a random area ");
        int number = scanner.nextInt();
        Random random = new Random();

        int number2 = random.nextInt(number) + 1;
        System.out.println(" The System generated a number " + number2 );

    }
}
