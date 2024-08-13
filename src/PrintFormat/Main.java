package PrintFormat;

public class Main {

    public static void main(String[] args) {

        int a =5;
        int b = 15;

        System.out.println("a = " + a + " b = " + b);
        System.out.printf("a = %d;b = %d" ,a,b);

        // %d - dlya zelochislennych
        // %c - dlya simvola
        // %s - dlya stroki
        // %f - chisla s plavauschei tochkoi


        String name = "John";
        int age = 25;
        float salary = 3000.7234f;

        System.out.printf("\nname:%s, age: %d, salary: %.2f",name,age,salary);


    }
}
