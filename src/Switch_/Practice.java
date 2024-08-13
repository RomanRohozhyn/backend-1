package Switch_;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = scanner.nextInt();

        //System.out.println("year/4.0");
        //System.out.println("year/100.0");
        //System.out.println("year/400.0");



        boolean a = (year % 4) == 0;
        boolean b = (year % 100) != 0;
        boolean c = (year % 100 == 0)&&(year % 400 == 0);

        boolean result = (a != b)||(a == c);
        System.out.println("is " + year + " a leap year ?" + result );


        System.out.println( a);
        System.out.println( b);
        System.out.println( c);

        System.out.println("a != b" + (a != b ));
        System.out.println("a == c" + (a == c));


    }
}
