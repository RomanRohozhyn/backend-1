package For_each;

public class Main {

    public static void main(String[] args) {

        // for(type variable:array){statements}

        int[] numbers ={10,20,30,40,50};

        //int i = 0;
        //int sum = 0;

       /* for(i = 0;i < numbers.length;i++)
        {
         sum = sum + numbers[i];

        }

        */
        //System.out.println("Sum of all elements is :" + sum);

       // with for-each
        System.out.println("With for-each");

        int sum = 0;
        for (int x :numbers)
        {
         sum += x;
        }
        System.out.println("Sum of all elements is :" + sum);

        System.out.println("print ints erray");

        int[] ints = {10,20,30,40,50};
        for (int element : ints)
        {
            if (element == 30)
                break;
            System.out.println(element + " : ");

        }

        System.out.println("An attempt to change elements with for-each");

        for(int element : ints)
        {
            System.out.print(element + " ");
            element = element * 100;
        }
        System.out.println();

        for( int element : ints)
        {
            System.out.print(element + " ");

        }




    }
}
