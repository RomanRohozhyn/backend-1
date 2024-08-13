package Praktika_08_08_24;

public class MultiplicationOfNumber {

    public static void main(String[] args) {

        multiplicationNumber(10);

    }
    static void multiplicationNumber(int n){

        int i = 1;
        int res = 0;

        while (i <= n )
        {
             res = i * n;
            System.out.println( i + " * " +  n + " = " + res);
            i++;

        }

    }

}
