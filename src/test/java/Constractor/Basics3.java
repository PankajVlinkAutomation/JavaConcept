package Constractor;

public class Basics3 extends Basics2{
    Basics3(int x) {
        super(2);
        System.out.println("Basic 3 const");
    }
    public static void main(String[] args) {
        helloWorld();
        helloWorld2();
        gear();
        speed();
        Basics3 obj3 = new Basics3(3);
    }
    public static void speed(){
        System.out.println("speed in basic3");
    }


}
