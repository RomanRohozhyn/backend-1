package Switch_;

import java.util.Scanner;

public class DayOfWeek {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 7 ");

        int dayOfWeekNumber = scanner.nextInt();

        switch (dayOfWeekNumber){

            case 1:
                System.out.println("monday");
                break;

            case 2:
                System.out.println("Tuesday");

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("There no day with such number");



        }

        scanner.close();

    }
}
