package Praktikum_02_08_24;

import java.util.Scanner;

public class Calkulator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number 1 :");
        double userNumber1 = scanner.nextDouble();

        System.out.println("Enter a number 2 :");
        double userNumber2 = scanner.nextDouble();

        System.out.println("Select an : 1. + ; 2. - ; 3. * ; 4./ ;");
        int userOperation = scanner.nextInt();

        switch (userOperation){

            case 1 :
                System.out.println("You entered " + "\nnumber 1 is " + userNumber1 + "\nnumber 2 is " + userNumber2 +
                        " \nThe sum of the numbers is equal to : " + (userNumber1 + userNumber2));
                break;

            case 2 :
                System.out.println("You entered " + "\nnumber 1 is " + userNumber1 + "\nnumber 2 is " + userNumber2 +
                        " \nThe difference of the numbers is equal to : " + (userNumber1 - userNumber2));
                break;

            case 3 :
                System.out.println("You entered " + "\nnumber 1 is " + userNumber1 + "\nnumber 2 is " + userNumber2 +
                        " \nThe product of the numbers is equal to : " + (userNumber1 * userNumber2));
                break;

            case 4 :
                System.out.println("You entered " + "\nnumber 1 is " + userNumber1 + "\nnumber 2 is " + userNumber2 +
                        " \nThe division of numbers is equal to : " + (userNumber1 / userNumber2 ));
                break;

            default:
                System.out.println("You entered an incorrect operation.");



        }


    }
}
