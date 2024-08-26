package Praktika_26_08_24;

public class LetterFirstToEnd {

    public static void main(String[] args) {

        System.out.println(firstToEnd("java"));

    }

    public static String firstToEnd(String str) {

        String str1 = str.substring(1);
        char str2 = str.charAt(0);
        return str1 + str2;

    }




}
