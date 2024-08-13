package Praktikum_06_08_24;

import java.util.Scanner;

public class Vowel_Consonant_Letter {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Letter ");

        char ch = scanner.next().charAt(0);

        System.out.println(vowelConsolatLetter(ch));

        scanner.close();
    }
            public static char vowelConsolatLetter(char ch){



            switch (ch){

                case 'a','A','E','e','Y','y','U','u','I','i','O','o':
                    System.out.println(" Letter :" + ch + " is a vowel");
                  break;
                case 'Q','q','W','w','R','r','T','t','P','p','S','s','D','d','F','f','G','g','H','h','J','j','K','k',
                        'L','l','Z','z','X','x','C','c','V','v','B','b','N','n','M','m':
                    System.out.println("Letter : " + ch + " is a consonant");
                  break;

                default:
                    System.out.println("The symbol is not a letter");
            }


              return ch;

        }

    }


