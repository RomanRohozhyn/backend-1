package Praktikum_06_08_24;

public class Positiv_or_Negativ {

    public static void main(String[] args) {

        //System.out.println(positivOrNegativNum(0.34));

        positivOrNegativNum(0.56);
    }

    public static double positivOrNegativNum(double a){

        if(a > 0){
            System.out.println("The number : " + a + " is Positive");
        }
        else if (a < 0){
            System.out.println("The number : " + a + " is Negative");

        }
        else{
            System.out.println("The number : " + a + " is equals 0");
        }

         return a ;
    }
}





