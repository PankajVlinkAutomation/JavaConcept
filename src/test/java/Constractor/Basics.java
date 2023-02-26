package Constractor;

public class Basics {
    Basics(){

        System.out.println("A");
    }
    Basics(int a){
        int result=a*a;
        System.out.println("a");
    }
    Basics(int a,int b){
        this(11);
        System.out.println("a,b");
    }

    public static void helloWorld(){
        System.out.println("Hello world basics");
    }
    public static void helloWorld2(){
        System.out.println("Hello world-2 basics ");
    }
}
