package W3PracticeQuestion;

public class Increments {
    public static void main(String [] arg){
        System.out.println("hello");
        int a=25;
        byte b=100;
        //Type casting
        b=(byte)a;
        System.out.println(b);

        //Type Promotion:-
        byte num1=12;
        byte num2=127;

        int result=num1+num2;
        //he
        System.out.println(result);

        float f=5.8f;
        int i=(int)f;//Type casting float to int
        System.out.println(i);

        int p=8;
        p++; //post-Increment
        System.out.println("PostIncrement->"+p);
        ++p;//pre-Increment
        System.out.println("PreIncrement->"+p);

        p+=1;
        System.out.println(p);
        p+=2;
        System.out.println(p);

        int c=5;
        int res=c++;
        System.out.println(c);




    }
}
