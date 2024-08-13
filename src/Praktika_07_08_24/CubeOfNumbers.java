package Praktika_07_08_24;

public class CubeOfNumbers {

    public static void main(String[] args) {

        //System.out.println(printCube(5));
        printCube(4);
    }

    static int printCube(int n){

        int i = 1;
        int result = 0;

        while (i <= n){

            result = i * i * i;
           // result = Math.pow(i,3);
            System.out.println("result Cube number " + i + " is :" + result);
            i++;

        }
          return result;


    }
}
