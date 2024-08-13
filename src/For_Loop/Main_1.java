package For_Loop;

public class Main_1 {

    public static void main(String[] args) {

        System.out.println(sum(5));

        int sum = 0;
        for (int i = 1;i <= 5;sum += i++);

        System.out.println("sum is " + sum);


    }

    static int sum(int n){

        int i;
        int sum = 0;

        for (i = 1;i <= n;i++)
        {
            sum += i;


        }
        return sum;
    }




}
