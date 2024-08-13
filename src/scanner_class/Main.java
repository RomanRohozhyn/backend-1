package scanner_class;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ourScanner = new Scanner(System.in);

        System.out.println("Enter your name ");
        String name = ourScanner.nextLine();

        //System.out.println("You entered name " + name);

        System.out.println("Enter a surname");
        String secondName = ourScanner.nextLine();

        System.out.println("Enter age ");
        int age = ourScanner.nextInt();

        System.out.println("The name is " + name + secondName + " age is " + age);

        ourScanner.close();

    }
}
