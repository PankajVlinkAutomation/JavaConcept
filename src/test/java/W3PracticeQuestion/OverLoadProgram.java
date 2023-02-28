package W3PracticeQuestion;

public class OverLoadProgram {

    //Method Overloading:-
    // We can make multiple methods with same name but should be different parameters or type
    public int add(int a,int b){
        return a+b;
    }
    public double add(double a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String [] args){
       OverLoadProgram obj=new OverLoadProgram();
        System.out.println(obj.add(2,3));
        System.out.println(obj.add(2.5,4));
        System.out.println(obj.add(2,4,3));
    }
}
