package Praktikum_05_08_24;

public class Area {

    public static void main(String[] args) {

        System.out.println(areaResult(10,20));

    }

    static double areaResult(int rad1,int rad2){
        double a = Math.PI;
        double result = a * rad1 * rad2;
        return result;

    }



}
