package Praktika_20_08_24;

public class Main {

   /* Написать метод, принимающий массив целых чисел и проверяющий равна ли сумма всех имеющихся там чисел 10 тридцати.
    Метод возвращает false если нет и true если да.
    т.е. для массива 10, 15, 10, 1, 25, 10 -> true
    для массива 10, 15, 10, 1, 25, 45 -> false
    Фактически, в общем виде метод проверяет равна ли сумма всех элементов массива, равных n числу m
  */

    public static void main(String[] args) {

        int[] array1 = {10, 15, 10, 1, 25, 45};
        //int n = 10;
       // int numberRes = 30;
        int[] array2 = {23,45,65,76,10,34,25,67,10,45,36,89,245,};

        System.out.println(arrayResult(array2,10,30));

    }



       public static boolean arrayResult(int[] array,int n , int numberRes){

        int sum = 0;

        for (int j:array)
        {
            if(j == n)
            {
                sum = sum + n;

                if( sum == numberRes){

                    return true;
                }
            }

        }return false;
    }
}
