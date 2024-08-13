package Praktikum_05_08_24;

public class Fahrenheit_Celsius {

    public static void main(String[] args) {

        System.out.println(Celsius(70));
    }

    static double Celsius(double f){

      double result = 5 *(f - 32)/9;
      return result;

    }


}
