package Praktika_21_08_24;

public class stringKankat {

  //  Написать метод, принимающий две строки и возвращающий эти строки, соединенные вместе,
    //  но без первых букв и в верхнем регистре.
    //Пример: "Hello", "There" -> ELLOHERE

    public static void main(String[] args) {

        System.out.println(neuString("Hello","There"));
    }

    public static String neuString (String a,String b){

        String partOfHello = "Hello".substring(1);
        String partOfThere = "There".substring(1);
        String resConcat = partOfHello.concat(partOfThere);
        String resUpperCase = resConcat.toUpperCase();

        return resUpperCase;
    }
}
