package our_strings;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String java = "Java";
        String str1 = new String("Java");

        //0 1 2 3
        //J a v a

        java = "Hallo";
        System.out.println("String java is : " + java.length());

        //toCharArray()
        char[] halloArray = java.toCharArray();
        System.out.println(Arrays.toString(halloArray));


        //pystaja stroka

        String empty = "";
        System.out.println("empty length is " + empty.length());

         // isEmpty  ( result boolean)

        System.out.println(java.isEmpty());
        System.out.println(empty.isEmpty());

        String str = null;

        String string1 = "Hello";
        String string2 = "Java";
        String result = string1 + " " + string2 + " " + 2023;
        System.out.println(result);

        // concat()




    }
}
