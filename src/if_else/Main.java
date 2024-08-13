package if_else;

public class Main {

    public static void main(String[] args){

        //if(condition)statement

        int num = 200;
        if(num <= 100){
            System.out.println("num <= 100");
        }

        System.out.println("after if statement  ");

        //if else statement
        //if(condition)statement
        //   else statement
        num = 200;
        if(num <= 100){
            System.out.println("num <= 100");
        }
        else {
            System.out.println("num > 100");
        }
        num = 200;
        if(num <= 100){
            System.out.println("num <= 100");
            if(num > 40){
                System.out.println("number is greater than 40 ");
            }

            //if(condition)
            //    statement
            // else if(condition)
            //      statement
            //  ....
            // ....
            // else
            //       statement

            int x = 0;

            if(x == 1){
                System.out.println("x = 1");}
            else if(x == 2){
                System.out.println("x = 2");}
            else if(x == 3){
                System.out.println("x = 3");}
            else if(x == 4){
                System.out.println("x = 4");}
            else{
                System.out.println("x is not between 1 and 4");}

            System.out.println("if-else is finished");
        }

        int i = 1234;

        if(i < 10 && i >= 1){
            System.out.println("It is one digit number");
        }
        else if(i < 100 && i >= 10){
            System.out.println("It is two digit number");
        }
        else if (i < 1000 && i >= 100) {
            System.out.println("It is a three digit number");

        }
        else {
            System.out.println("The number has more than 3 digits");
        }

    }
}
