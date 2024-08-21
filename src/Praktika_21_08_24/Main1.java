package Praktika_21_08_24;

public class Main1 {

    //  Написать метод, принимающий строку и возвращающий эту строку с переставленной в конец строки первой буквой.
    //  Примет: abcd -> bcda

    public static void main(String[] args) {

        String str1 = "abcdghdygfdhgf";
        System.out.println(str1);
        chengeLetter(str1);

    }

    public static void chengeLetter(String str1){

        int i;

        for (i = 0; i < str1.length(); i++) {
            for (i = 1; i < str1.length(); i++) {

                System.out.print(str1.charAt(i));

            }
            System.out.print(str1.charAt(0));
        }

    }
}
