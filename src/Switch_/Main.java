package Switch_;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){


        /*switch(expression){
             case constant1:
             statements
             break;

             case constant2:
             statements
             break;
             .
             .
             .
             default
              statements


        }
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int i = scanner.nextInt();

        switch (i){
            case 0:
                System.out.println("i is zero");
                break;

            case 1:
                System.out.println("i is one");
                break;

            case 2:
                System.out.println("i is two");
                break;

            case 3:
                System.out.println("i is three");
                break;

            default:
                System.out.println("i is not between 0 and three");

        }
        System.out.println("After switch");

        char ch = 'a';
        switch (ch){

            case 'v':
                System.out.println("case v");
                break;

            case 'a':
                System.out.println("case a");
                break;

            case 'y':
                System.out.println("case y");
                break;
            default:
                System.out.println("no such letter");


        }
        System.out.println("After switch");
     scanner.close();
    }



}
