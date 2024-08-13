package For_Loop;

public class BreakContinue {

    public static void main(String[] args) {

        for (int i = 0 ;i <= 10 ; i++) {

            if (i == 6) {
                break;
            }
            System.out.print(i);

        }
        System.out.println("\nafter for");


        for (int i = 0 ;i <= 10 ; i++) {

            if (i == 6) {
                continue;
            }
            System.out.print(i);

        }
        System.out.println("\nwhile continue");

        int j = 0;

        while (j < 10)
        {
          if ( j == 6)
          {
              j++;
              continue;
          }
            System.out.print(j);
          j++;
        }

    }
}
