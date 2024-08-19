package FiguraNumbers;

public class FiguraNumbersNeu {

    public static void main(String[] args) {

        int i;
        int n = 4;

        for (i = 1; i < n;i++)
        {
            System.out.println(i);    // 1  ,,, 1
            int j = 0;

            for(j = 0 ; j < i; j++) // 0<=1,  1<=1, 2<=1
            {

                j++;       // j=1, j=2
                System.out.println("j" + j);  // 1,2


            }

        }

    }
}
