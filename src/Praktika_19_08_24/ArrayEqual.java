package Praktika_19_08_24;

import java.util.Arrays;

public class ArrayEqual {

    public static void main(String[] args) {

     int[] array1 = {6,2,3};
     int[] array2 = {6,2,3};

        System.out.println(areEqual(array1,array2));

      //  System.out.println(Arrays.equals(array1, array2));

    }


    public static boolean areEqual(int[] array1, int[] array2) {

        int i;

        if (array1.length != array2.length) {
            return false;
        }

        for (i = 0; i < array1.length; i++) {

         if(array1[i] != array2[i]){
             return false;
         }


        }return true;
    }
}
