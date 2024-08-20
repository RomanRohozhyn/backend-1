package bubble_sort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

       int[] array = {6,3,0,5,-2,67,89,51};
        bubbleSort(array);

        for(int i = 0;i < array.length;i++){

            System.out.print(array[i] + " ");
        }
        System.out.println("_______________________");
        System.out.println(Arrays.toString(array));

        System.out.println("sort with Arrays.sort");
        int[] ints = {6,1,0,-678,432,9};
        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));

    }

    public static void bubbleSort(int[] array){

        boolean sorted = false;
        int temp;

        while (!sorted)
        {   sorted = true;

            for(int i = 0;i < array.length -1;i++)
            {
               if (array[i] > array[i + 1])
               {
                   temp = array[i];
                   array[i] = array[i + 1];
                   array[i + 1] = temp;

                   sorted = false;

               }

            }

        }



    }

}
