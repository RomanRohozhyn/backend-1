package Arrays;

public class Main {

    public static void main(String[] args) {

        //  type[] array-name = new type[size]

        //int[] sample = new int[10];
        int[] sample;
        sample = new int[10];
        sample[0] = 45;
        System.out.println("zero element of sample is" + sample[0]);

        sample[1] = 30;
        sample[2] = 34;
        sample[3] = 307;

        System.out.println("first element of sample is" + sample[1]);
        System.out.println("second element of sample is" + sample[2]);
        System.out.println("3 element of sample is" + sample[3]);

        sample[2] = 21;
        System.out.println("second element of sample is" + sample[2]);

        //int[] sample
        //int []sample
        //int sample[]

        // 2 sposob                0  1 2  3  4
        int[] numbers = new int[]{10, 34, 6, 78, 97};
        System.out.println("zero element of numbers is " + numbers[0]);

        System.out.println("the last element of numbers is " + numbers[4]);

        // 3 sposob
        System.out.println("array nums");
        int[] nums = {34, 56, 89, 4, 1, 90};

        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);
        System.out.println(nums[4]);
        System.out.println(nums[5]);

        //length - razmer massiva

        int numsLength = nums.length;
        System.out.println("nums length " + numsLength);


        System.out.println("arrey nums printed in cycle");


        for (int i = 0; i < nums.length; i++) {
            System.out.println("nums [" + i + "] = " + nums[i]);

        }

        System.out.println("___________________");

        int[] ints = new int[10];
        for (int i = 0; i < ints.length; i++)
        {
            ints[i] = i;
        }

        for(int i = 0;i < ints.length; i++)
        {
            System.out.println("ints [" + i + "] = " + ints[i]);
        }

        System.out.println("--------------------------");
        //                   0      1      2    3
        String[] names = {"John","Mary","Ann","Bill"};



        for (int i = 0;i < names.length;i++)
        {
            System.out.println(names[i]);
        }

        for(int i = 0;i < names.length; i++)
        {
            System.out.println("names [" + i + "] = " + names[i]);
        }

        names[1] = "Kate";
        System.out.println("with Kate");
        for(int i = 0;i < names.length; i++)
        {
            System.out.println("names [" + i + "] = " + names[i]);
        }


        names[names.length -1] = "Tom";
        names[names.length -2] = "Peter";
        System.out.println("with Tom");
        for(int i = 0;i < names.length; i++)
        {
            System.out.println("names [" + i + "] = " + names[i]);
        }

        System.out.println("***************************");
        String[] fruits = new String[5];
        fruits[0] = "Banana";

        for(int i = 0;i < fruits.length; i++)
        {
            System.out.println("names [" + i + "] = " + fruits[i]);
        }

        System.out.println("________________________________");
        String[] newNames = new String[names.length +2];
        // kopiryem elementy starogo massiva

        for (int i = 0 ; i < names.length ; i++)
        {
         newNames[i] = names[i];
        }

        for(int i = 0;i < newNames.length; i++)
        {
            System.out.println("newNames [" + i + "] = " + newNames[i]);
        }

        System.out.println("________________________");
        newNames[newNames.length -1] = "Ben";
        newNames[newNames.length -2] = "Harry";

        for(int i = 0;i < newNames.length; i++)
        {
            System.out.println("newNames [" + i + "] = " + newNames[i]);
        }

        System.out.println("*****************************************");
        int[] array = {5,2,8,0,1,45};
        int max = array[0];

        for (int i = 1;i < array.length;i++)
        {
            if (array[i] > max)
            {
                max = array[i];
            }
            System.out.println(max);
        }



    }
}