package Do_while;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    // do ( statements ) while(condition)

        int i = 10 ;

        do {
          //  System.out.println(i);
            i--;
        }while (i > 1);


        example();

    }

    static void example(){

        Scanner scanner = new Scanner(System.in);
        char ch;

        do {
            System.out.println("Enter a Letter/q to quit");
            ch = scanner.next().charAt(0);

            System.out.println("you have entered " + ch);

        }while (ch != 'q');

    }


}
