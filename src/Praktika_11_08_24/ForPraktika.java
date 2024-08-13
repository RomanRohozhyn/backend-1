package Praktika_11_08_24;

import java.util.Scanner;

public class ForPraktika {

    public static void main(String[] args) {

        System.out.println("Enter a number :");
        Scanner scanner = new Scanner(System.in);

        int userNumber = scanner.nextInt();
        printSumUserNumber(userNumber);

        scanner.close();
    }

    static void printSumUserNumber(int userNumber){

        if (userNumber >= 0)
        {
            int j;
            int sum;

            for (j = 1 ; j <= 10; j++)
            {
                sum = userNumber * j;
                System.out.println( userNumber  + " * " + j + " = " + sum );
            }
        }
           else
          {
              System.out.println("Your  number < 0 ");
              System.out.println("Entered number > or = 0");
          }

    }

}
