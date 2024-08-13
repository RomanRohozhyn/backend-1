package Switch_;

import java.util.Scanner;

public class HelpSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Our Help System.Enter menu number");
        System.out.println("\t1. if");
        System.out.println("\t2. Switch");

        int choice = scanner.nextInt();

        System.out.println("\n");

        switch (choice){

            case 1 :
                System.out.println("IF :");
                System.out.println("if(condition){statement}");
                System.out.println("     else{statements}");

                break;
            case 2 :
                System.out.println("Switch :");
                System.out.println("Switch(condition){ ");
                System.out.println("     case constant :");
                System.out.println("       statements");
                System.out.println("           break");
                System.out.println("default :");
                System.out.println("}");
                break;

            default:
                System.out.println("Please enter 1 or 2");


        }
           scanner.close();
    }
}
