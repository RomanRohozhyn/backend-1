package For_Loop;

public class Main {

    public static void main(String[] args) {

     //for(initialization;condition;incr/decr)
     //initialization - i
     //print10();

     int i,j;

     for (i = 1 , j = 10; i <= j ; i++,j--)
     {
         System.out.println(" i: " + i + "  ,j: " + j);

     }

      for( int y = 0; y < 5 ;)
      {
          System.out.println(y);
          y++;
      }


    }

    static void print10(){

        int i;

        for ( i = 1 ; i <= 10 ; i++)
        {

            System.out.println(i);

        }

    }







}
