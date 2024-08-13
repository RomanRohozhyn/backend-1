package Praktikum_29_07_24;

import java.util.Scanner;

public class Char_ubung {

    public static void main(String[] args){

        Scanner ourScanner = new Scanner(System.in);

        System.out.println("Enter first name");
        String name = ourScanner.nextLine();
        System.out.println("First name : " + name);

        System.out.println("Enter last name");
        String lastName = ourScanner.nextLine();
        System.out.println("Last name : " + lastName);

        System.out.println("Enter age");
        int age = ourScanner.nextInt();
        System.out.println("Age : " + age);

        System.out.println("First name : " + name + "\nLast name : " + lastName + "\nAge : " + age);


    }
}
