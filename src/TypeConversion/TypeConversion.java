package TypeConversion;

public class TypeConversion {

    public static void main(String[] args) {

        int a = 25;
        float fl;

        fl = a;

        long l = 100000234L;
        double d = l;

        double d1 = 1896754.0;
        //l = d1

        // (target-type) expression

        double x =10.0;
        double y = 3.0;

        int i = (int) (x/y);
        System.out.println("int result x/y " + i);

        i = 100;
        byte b =(byte) i;
        System.out.println(" b = " + b);

        i = 320;
        b = (byte) i;
        System.out.println(" b = " + b);


        b = 87;
        char ch =(char) b;
        System.out.println("ch is " + b);

        //var

        int k = 10;
        var num = 34;
        var word = "John";




    }

}
