package While;

public class Main {

    public static void main(String[] args) {

        // while(condition){statement}

      //  int y = 1;

        //while (y < 6) {

           // if (y % 2 == 0) {
                //System.out.println(y + " is even");

          //  } else {
              //  System.out.println(y + " is odd");
          //  }
           // y++;

      //  }

       // char ch = 'a';
      //  while (ch <= 'z'){
          //  System.out.println(ch);
          //  ch++;
      //  }

       // while (true){
       //     System.out.println(1);
       // }

        System.out.println("Count sum");
        System.out.println(sumNumbers(5));

    }

    static int sumNumbers(int n){

        int sum = 0;
        int i = 1;
        while (i <= n){
           sum = sum + i;
           i++;

        } return sum;

    }


}
