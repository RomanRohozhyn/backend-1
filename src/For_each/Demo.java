package For_each;

public class Demo {

    public static void main(String[] args) {

        int[] numbers = {7, 19, 2, 0, 23, 9};

        int value = 9;
        boolean isFound = false;

        for (int elt : numbers) {
            if (elt == value) {
                isFound = true;
                break;
            }
        }

        if (isFound) {
            System.out.println("The value " + value + " is found");

        } else
            System.out.println("The value " + value + " is not found");

        int[] array = {3,6,13,0};
        System.out.println( "index of the element is " + findIndex(array,13));
        System.out.println( "index of the element is " + findIndex(array,0));
        System.out.println( "index of the element is " + findIndex(array,67));

        int[] empty = {};
        System.out.println("empty length = " + empty.length);
        System.out.println( "index of the element is " + findIndex(empty,67));

        int[] test = new int[10];
        System.out.println("test length is " + test.length);
        for (int x:test)
        {
            System.out.println(x);
        }

    }


    public static int findIndex(int[] array, int n) {

        if (array.length == 0) {
            return -1;
        }

       for(int i = 0; i < array.length;i++)
       {
           if(array[i] == n)
           {
            return i;
           }
       }
       return -1;

    }







}
