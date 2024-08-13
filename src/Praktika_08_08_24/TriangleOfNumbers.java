package Praktika_08_08_24;

public class TriangleOfNumbers {

    public static void main(String[] args) {


        triangleNumbers(6);


    }


    static void triangleNumbers(int n){

        int i = 1;


        while (i <= n)
        {
            int j = 1;
            while (j <= i)
            {
                System.out.print(j);//1
                j++;
            }

            i++;
            System.out.println();

        }





    }



}
