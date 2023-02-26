package W3PracticeQuestion;

@FunctionalInterface
interface A{
    void play();
}


public class LambdaAndInterface {
    public static void main(String[] args) {
        A interfaceObj=()-> System.out.println("durgesh");
        interfaceObj.play();
    }
}
//In Functional Interface, It allows only one abstract method.But you can use Object class methods in functional Interface.
//We can't create object of Interface.
//We can create object of implementation of interface of class.
//First implements class to Interface then create object of that class then with this object we can call methods of interface.
//In java 8 -in place of ananyoums class & inner class , we can use lambda expression.
//where () is for parameter and ->for method

