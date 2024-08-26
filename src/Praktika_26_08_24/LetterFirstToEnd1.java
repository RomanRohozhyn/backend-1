package Praktika_26_08_24;

public class LetterFirstToEnd1 {

    public static void main(String[] args) {

        System.out.println("abcd is : " + firstToEnd1("abcd"));
    }


    public static String firstToEnd1(String str){

        String str1 = str.substring(1);
        char str2 = str.charAt(0);

        return str1 + str2;



    }
}
