package Praktika_23_08_24;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

    int[] number = {12,23,45,65,43,23,68,30,60};


    for ( int n : number)
    {
        if (n%2 == 0)
        {
            int res = n * 100;
            System.out.println( n + " das ist + zahlen : " + res);
        }
        else
            System.out.println("zahlen  : " + n + "  nein");


    }

    }

}
