package Praktika_17_08_24;

public class FindMinNumberArray {

    public static void main(String[] args) {

        int[] ints = {38,6,93,75,23,46};

        int minNumber = ints[0];

        for (int i = 1;i < ints.length;i++)
        {
            if (ints[i] < minNumber)
           {
               minNumber = ints[i];
               System.out.println(minNumber);

           }

        }
    }
}
