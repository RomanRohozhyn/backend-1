package Methods;

public class Main {

    public static void main(String[] args) {

        //hello();
        walk("John",35);
        walk("Mary",25);
        int x = 2;
        int y = 3;
        int result = sum(1,2);
        System.out.println("result of sum method is " + result);
        System.out.println("result 2 of sum method is " + sum(x,y));
        sum(x,y);

       String res = sayHello("John");
       System.out.println(res);

    }

    static void hello(){
        System.out.print("hello");
        System.out.println("\nworld");
    }
    static void walk(String name,int age){

        System.out.println(name + " i can walk" + " he is " + age);
    }

    static int sum(int a,int b){

        int plus = a + b;
        int minus = a - b;
        //System.out.println(plus);
        //System.out.println(minus);

        return plus;

    }
    static String sayHello(String name){
        return "Hello " + name + " !";

    }


}
