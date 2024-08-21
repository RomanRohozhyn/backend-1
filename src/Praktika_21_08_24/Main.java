package Praktika_21_08_24;

public class Main {

   // Написать метод, принимающий строку и возвращающий целое число, равное двойной длине строки
    // Пример: Hello -> 10

    public static void main(String[] args) {


        System.out.println(resLengthString("Java"));

    }

       public static String resLengthString(String str){


       String resultLength = String.valueOf(str.length() * 2);


           return resultLength ;
       }


}
