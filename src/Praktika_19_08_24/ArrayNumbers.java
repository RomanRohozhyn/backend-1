package Praktika_19_08_24;

public class ArrayNumbers {

    public static void main(String[] args) {

        int[] ints = {1, 2, 3, 4, 6, 7, 8, 4,20};

        System.out.println(arrayNumber(ints));

    }

      public static int arrayNumber(int[] ints){
        int i ;
        int sum = 0;

      for (i = 0 ; i < ints.length;i++)
      {
          if(ints[i]%2 == 0){

              int n = 1;

              sum = sum + n;
          }
      }
      return sum;
      }
}
