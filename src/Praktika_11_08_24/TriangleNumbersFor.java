package Praktika_11_08_24;

public class TriangleNumbersFor {
    public static void main(String[] args) {

      triangleNumbers(8);

    }

    static void triangleNumbers(int n) {

        int i;


        for(i = 1; i <= n ; i++){

        //while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print(j);
                j++;
            }

           // i++;
            System.out.println(" ");

        }

    }
}
