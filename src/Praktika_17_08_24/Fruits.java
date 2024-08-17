package Praktika_17_08_24;

public class Fruits {

    public static void main(String[] args) {
        System.out.println("fruits ohne kiwi");

        String[] fruits = {"Orange","Apple","Banana","Mango"};

        for (int i = 0;i < fruits.length;i++)
        {
            System.out.println(fruits[i]);
        }
        System.out.println("________________________________________________-");
        System.out.println("fruits mit kiwi");
        fruits[0] = "Kiwi";

        for (int i = 0;i < fruits.length;i++)
        {
            System.out.println(fruits[i]);
        }

        System.out.println("_____________________________________________");

        for (int i = 0;i < fruits.length;i++)
        {
           if (i % 2 == 0)
           {
               System.out.println("even elements " + fruits[i]);
           }
        }

    }
}
